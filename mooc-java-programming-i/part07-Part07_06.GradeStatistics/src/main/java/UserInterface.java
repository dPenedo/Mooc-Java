import java.util.Scanner;
import java.util.ArrayList;

/**
 * UserInterface
 */
public class UserInterface {
    private ArrayList<Integer> points;
    private Scanner scanner;

    public UserInterface() {
        this.points = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public ArrayList<Integer> askForPoints() {
        ArrayList<Integer> listOfPoints = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int givenPoint = Integer.valueOf(scanner.nextLine());
            if (givenPoint == -1) {
                break;
            } else if (givenPoint > 0 && givenPoint <= 100) {
                listOfPoints.add(givenPoint);
            }
        }
        return listOfPoints;
    }

    public double average(ArrayList<Integer> listOfPoints) {
        int numberOfPoints = 0;
        int sumOfPoints = 0;
        for (Integer point : listOfPoints) {
            sumOfPoints += point;
            numberOfPoints++;
        }
        double average = (double) sumOfPoints / numberOfPoints;
        System.out.println("Point average (all): " + average);

        return average;
    }

    public double averageOfPassing(ArrayList<Integer> listOfPoints) {
        int numberOfPoints = 0;
        int sumOfPoints = 0;
        for (Integer point : listOfPoints) {
            if (point >= 50) {
                sumOfPoints += point;
                numberOfPoints++;
            }
        }
        double averageOfPassing = (double) sumOfPoints / numberOfPoints;
        System.out.println("Point average (passing): " + averageOfPassing);
        return averageOfPassing;
    }

    public double passPercentage(ArrayList<Integer> listOfPoints) {
        int passing = 0;
        for (Integer integer : listOfPoints) {
            if (integer >= 50) {
                passing++;
            }
        }
        double passPercentage = (double) (passing * 100) / listOfPoints.size();
        System.out.println("Pass percentage: " + passPercentage );
        return passPercentage;
    }

    // Separar lógica tomando de aqui https://java-programming.mooc.fi/part-6/2-separating-user-interface-from-program-logic
    public void gradeDistribution(ArrayList<Integer> listOfPoints) {

    }


}
