
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int maxValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int minValue = Integer.valueOf(scanner.nextLine());
        for (int i = minValue; i <= maxValue; i++) {
            System.out.println(i);
        }
    }
}
