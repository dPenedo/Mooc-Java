
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenValue = Integer.valueOf(scanner.nextLine());
        if (givenValue < 0) {
            System.out.println(givenValue * -1);
        } else {
            System.out.println(givenValue);
        }

    }
}
