
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int givenValue = Integer.valueOf(scanner.nextLine());
            if (givenValue == 0) {
                break;
            } else if (givenValue < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(givenValue * givenValue);
            }
        }

    }
}
