import java.util.Scanner;

/**
 * UserInterface
 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if(command.equals("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            } else if(command.equals("list")){
                todoList.print();
            } else if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int numberToRemove = Integer.parseInt(scanner.nextLine());
                todoList.remove(numberToRemove);
            }

        }
    }


}
