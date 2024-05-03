
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int givenValue = Integer.valueOf(scanner.nextLine());
            if (givenValue == 0) {
                break;
            } else {
                numberOfNumbers += 1;
            }
        }
        System.out.println("Number of numbers: " + numberOfNumbers);
    }
}
