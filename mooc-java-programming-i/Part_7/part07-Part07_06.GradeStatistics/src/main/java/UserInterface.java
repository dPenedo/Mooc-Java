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



}
