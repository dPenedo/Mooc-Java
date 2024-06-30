package title;


import javafx.application.Application;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a title for the window");
        String titleInput = scanner.nextLine();

        Application.launch(UserTitle.class,
                "--title:"+ titleInput);

    }

}
