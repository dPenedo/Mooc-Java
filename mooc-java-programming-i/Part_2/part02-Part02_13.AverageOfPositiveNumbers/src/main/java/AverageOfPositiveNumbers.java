
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 0;
        int numberOfPositiveNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number: ");
            int givenValue = Integer.valueOf(scanner.nextLine());
            if (givenValue == 0) {
                break;
            } else if (givenValue > 0) {
                numberOfPositiveNumbers++;
                numberOfNumbers++;
                sumOfNumbers += givenValue;
            } else {
                continue;
            }
        }
        double averageOfNumbers = (double) sumOfNumbers / (double) numberOfNumbers;
        if (numberOfPositiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(averageOfNumbers);
        }
    }
}
