
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue = Integer.valueOf(scanner.nextLine());
        int secondValue = Integer.valueOf(scanner.nextLine());
        if (firstValue == secondValue) {
            System.out.println(firstValue + " is equal to " + secondValue);
        } else if (firstValue < secondValue) {
            System.out.println(firstValue + " is smaller than " + secondValue);
        } else {
            System.out.println(firstValue + " is greater than " + secondValue);

        }

    }
}
