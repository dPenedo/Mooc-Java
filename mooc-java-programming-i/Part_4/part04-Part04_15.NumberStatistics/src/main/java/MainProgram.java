
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the
        // exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers:");
        Statistics sumOfInput = new Statistics();
        Statistics sumOfEven = new Statistics();
        Statistics sumOfOdd = new Statistics();
        while (true) {
            int numberToSum = Integer.valueOf(scanner.nextLine());
            if (numberToSum == -1) {
                System.out.println("Sum: " + sumOfInput.sum());
                System.out.println("Sum of even numbers: " + sumOfEven.sum());
                System.out.println("Sum of odd numbers: " + sumOfOdd.sum());
                break;
            }
            if (numberToSum%2==0) {
                sumOfEven.addNumber(numberToSum);
            } else if(numberToSum%2!=0){
                sumOfOdd.addNumber(numberToSum);
            }
            sumOfInput.addNumber(numberToSum);

        }
    }
}
