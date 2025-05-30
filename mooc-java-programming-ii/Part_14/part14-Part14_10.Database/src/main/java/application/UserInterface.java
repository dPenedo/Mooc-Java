package application;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            // List
            if (command.equals("1")) {
                System.out.println("-------------------------");
                System.out.println("Listing the database contents");
                // TODO: insertar salto de linea entre items
                System.out.println(database.list());
            }
            // Add
            if (command.equals("2")) {
                System.out.println("Adding a new todo");
                System.out.println("Enter name");
                String name = this.scanner.nextLine();
                System.out.println("Enter description");
                String description = this.scanner.nextLine();
                Boolean done = false;
                Todo newTodo = new Todo(name, description, done);
                database.add(newTodo);
            }
            // Done
            if (command.equals("3")) {
                System.out.println("Which todo should be marked as done (give the id)?");
                int idDone = (int) Integer.valueOf(this.scanner.nextLine());
                database.markAsDone(idDone);
            }
            // Remove
            if (command.equals("4")) {
                System.out.println("Which todo should be marked as done (give the id)?");
                int idToRemove = (int) Integer.valueOf(this.scanner.nextLine());
                database.remove(idToRemove);
            }
            // Exit
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
        }

        System.out.println("Thank you!");
    }

}
