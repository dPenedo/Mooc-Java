import java.util.Scanner;

/**
 * UserIterface
 */
public class UserIterface {

    private Scanner scanner;
    private Container firstContainer;
    private Container secondContainer;

    public UserIterface(Scanner scanner) {
        this.scanner = scanner;
        this.firstContainer = new Container();
        this.secondContainer = new Container();
    }

    public void start() {
        while (true) {
            System.out.println("First: " + this.firstContainer.contains() + "/100");
            System.out.println("Second: " + this.secondContainer.contains() + "/100");

            String input = this.scanner.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (command.equals("add")) {
                    firstContainer.add(amount);
                } else if (command.equals("move")) {
                    if (firstContainer.contains() - amount < 0) {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(amount);
                    }else if(firstContainer.contains() - amount >= 0){
                        firstContainer.remove(amount);
                        secondContainer.add(amount);
                    }
                } else if (command.equals("remove")) {
                    secondContainer.remove(amount);
                }

            }
        }
    }
}
