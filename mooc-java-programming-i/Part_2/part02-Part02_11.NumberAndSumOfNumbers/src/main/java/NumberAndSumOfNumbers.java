
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number: ");
            int givenValue = Integer.valueOf(scanner.nextLine());
            if (givenValue == 0) {
                break;
            } else {
                numberOfNumbers++;
                sumOfNumbers = sumOfNumbers + givenValue;
            }
        }
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);

    }
}
