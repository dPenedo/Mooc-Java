
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("")) {
                break;
            }
            inputList.add(row);
        }

        String inputStrings = inputList.stream()
            .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(inputStrings);

        scanner.close();
    }
}
