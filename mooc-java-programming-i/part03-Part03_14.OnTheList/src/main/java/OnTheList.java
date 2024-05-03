
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("Search for?");
                String wordToFind = scanner.nextLine();
                boolean wordFound = false;
                for (String word : list) {
                    if (word.equals(wordToFind)) {
                        wordFound = true;
                    }
                }
                if (wordFound) {
                    System.out.println(wordToFind + " was found!");
                    break;
                } else {
                    System.out.println(wordToFind + " was not found!");
                    break;
                }
            }

            list.add(input);
        }

    }
}
