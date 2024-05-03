
import java.util.Scanner;

public class AverageOfNumbers {

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
                sumOfNumbers += givenValue;
            }
        }
        double averageOfNumbers = (double) sumOfNumbers / (double) numberOfNumbers;
        System.out.println("Average of the numbers: " + averageOfNumbers);
    }
}
