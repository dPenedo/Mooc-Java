
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(9);
        numbers.add(9);
        numbers.add(9);
        numbers.add(9);
        numbers.add(9);
        System.out.println("The numbers in the range [3, 5]");
        printNumbersInRange(numbers, 3, 5);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer integer : numbers) {
            if (integer >= lowerLimit && integer <= upperLimit) {
                System.out.println(integer);
            }
        }
    }

}
