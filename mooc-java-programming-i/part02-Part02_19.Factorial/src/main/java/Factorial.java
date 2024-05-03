
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        for (int i = 1; i <= lastNumber; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);

    }
}
