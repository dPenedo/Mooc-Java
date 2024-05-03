
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNegativeNumbers = 0;
        while (true) {
            System.out.println("Give a number: ");
            int givenValue = Integer.valueOf(scanner.nextLine());
            if (givenValue == 0) {
                break;
            } else if (givenValue < 0) {
                numberOfNegativeNumbers++;
            }
        }
        System.out.println("Number of negative numbers: " + numberOfNegativeNumbers);

    }
}
