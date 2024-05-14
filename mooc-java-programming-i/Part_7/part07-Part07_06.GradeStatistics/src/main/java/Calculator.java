import java.util.ArrayList;

/**
 * Calculator
 */
public class Calculator {
    public Calculator(){

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
        System.out.println("Pass percentage: " + passPercentage);
        return passPercentage;
    }


}
