import java.util.Scanner;

/**
 * UserInterface
 */
public class UserInterface {
    private JokeManager jokeRegister;
    private Scanner scanner;

    public UserInterface(JokeManager jokeRegister, Scanner scanner) {
        this.jokeRegister = jokeRegister;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeRegister.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing jokes:");
                System.out.println(jokeRegister.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing jokes:");
                jokeRegister.printJokes();
            }
        }
    }

}
