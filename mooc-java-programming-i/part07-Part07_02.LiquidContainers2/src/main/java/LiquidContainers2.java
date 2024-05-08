
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            String[] parts = input.contains(" ") ? input.split(" ") : new String[] { input };
            String command = parts[0];
            int quantity = parts.length > 1 ? Integer.valueOf(parts[1]) : 0;
            if (input.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                if (quantity > 0 && (first.contains() + quantity) < 100) {
                    first.add(quantity);
                } else if (first.contains() + quantity > 100) {
                    first.add(quantity);

                }
            } else if (command.equals("move")) {
                if (first.contains() >= quantity && (second.contains() + quantity) < 100) {
                    first.remove(quantity);
                    second.add(quantity);
                } else if (first.contains() < quantity && first.contains() != 0) {
                    second.add(first.contains());
                    first.remove(quantity);
                } else if ((first.contains() + quantity > 100) && (second.contains() + quantity) > 100) {
                    second.add(quantity);
                    first.remove(quantity);
                }
            } else if (command.equals("remove")) {
                if (second.contains() > quantity && second.contains() + quantity > 0) {
                    second.remove(quantity);

                } else if (second.contains() < quantity) {
                    second.remove(quantity);
                }

            }

        }
        scan.close();
    }



}
