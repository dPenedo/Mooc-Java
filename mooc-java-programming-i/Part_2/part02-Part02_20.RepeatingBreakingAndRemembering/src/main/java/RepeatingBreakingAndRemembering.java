
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int numberOfNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while (true) {
            System.out.println("Give numbers:");
            int givenNumber = Integer.valueOf(scanner.nextLine());
            if (givenNumber == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                if (givenNumber % 2 == 0) {
                    evenNumbers++;
                } else {
                    oddNumbers++;
                }
                sumOfNumbers += givenNumber;
                numberOfNumbers++;
            }
        }
        double average = (double) sumOfNumbers / numberOfNumbers;
        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
