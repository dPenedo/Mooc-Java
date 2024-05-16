
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
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (command.equals("add")) {
                    if (amount > 0 && amount + first < 100) {
                        first += amount;
                    } else if (amount + first > 100) {
                        first = 100;
                    }

                } else if (command.equals("move")) {
                    if (amount > 0 && amount <= first && amount + second < 100) {
                        first -= amount;
                        second += amount;
                    } else if (amount > 0 && amount > first && amount + second < 100) {
                        second += first;
                        first = 0;
                    } else if (amount > 0 && amount < first && amount + second > 100) {
                        second = 100;
                        first -= amount;

                    } else if (amount > 0 && amount > first && amount + second > 100) {
                        second = 100;
                        first = 0;
                    }

                } else if (command.equals("remove")) {
                    if (amount > 0 && second - amount > 0) {
                        second -= amount;
                    } else if (amount > 0 && second - amount < 0) {
                        second = 0;
                    }

                }
            }
        }
        scan.close();

    }
}
