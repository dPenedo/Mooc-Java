import java.util.Scanner;

/**
 * TextUi
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (word.equals("add")) {
                System.out.print("Word: ");
                String givenWord = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(givenWord, translation);
            } else if (word.equals("search")) {
                System.out.print("To be translated: ");
                String wordToTranslate = scanner.nextLine();
                if (simpleDictionary.translate(wordToTranslate) == null) {
                    System.out.println("Word " + wordToTranslate + " was not found");
                } else {
                    System.out.println("Translation: " + simpleDictionary.translate(wordToTranslate));
                }
            } else {
                System.out.println("Unknown command");
            }

        }
    }

}
