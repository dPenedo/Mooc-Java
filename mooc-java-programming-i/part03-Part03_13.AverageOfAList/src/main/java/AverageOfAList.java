
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

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
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sumOfNumbers = 0;
        int numberOfNumbers = list.size();
        for (int number : list) {
            sumOfNumbers += number;
        }
        double averageOfAList = (double) sumOfNumbers / numberOfNumbers;
        System.out.println("Average: " + averageOfAList);
    }
}
