
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] parts = input.contains(" ") ? input.split(" ") : new String[] { input };
            String command = parts[0];
            int quantity = parts.length > 1 ? Integer.valueOf(parts[1]) : 0;
            if (input.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                if (quantity > 0 && (first + quantity) < 100) {
                    first += quantity;
                } else if (first + quantity > 100) {
                    first = 100;

                }
            } else if (command.equals("move")) {
                if (first >= quantity && (second + quantity) < 100) {
                    first -= quantity;
                    second += quantity;
                } else if (first < quantity && first != 0) {
                    second += first;
                    first = 0;
                } else if ((first + quantity > 100) && (second + quantity) > 100) {
                    second = 100;
                    first = 0;
                }
            } else if (command.equals("remove")) {
                if (second > quantity && second + quantity > 0) {
                    second -= quantity;

                } else if (second < quantity) {
                    second = 0;
                }

            }

        }
        scan.close();
    }

}
