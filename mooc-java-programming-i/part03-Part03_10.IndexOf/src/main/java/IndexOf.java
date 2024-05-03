
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for? ");
        int givenItem = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            int listItem = list.get(i);
            if (listItem == givenItem) {
                System.out.println(givenItem + " is at index " + i);
            }
        }

    }
}
