
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int givenValue = Integer.valueOf(scanner.nextLine());
            if (givenValue == 9999) {
                break;
            }
            list.add(givenValue);
        }
        int smallestNumber = list.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            int listItem = list.get(i);
            if (listItem < smallestNumber) {
                smallestNumber = listItem;
                smallestIndex = i;
            }
        }

        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Found at index : " + smallestIndex);

    }
}
