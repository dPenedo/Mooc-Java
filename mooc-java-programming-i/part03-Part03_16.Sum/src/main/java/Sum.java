
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        System.out.println(sum(numbers));

    }

    public static int sum(ArrayList<Integer> numbers) {
        int sumResult = 0;
        for (Integer number : numbers) {
            sumResult += number;
        }

        return sumResult;
    }
}
