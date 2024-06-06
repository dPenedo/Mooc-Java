
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    // by 2 3 or 5
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> divisibleNumbers = numbers.stream()
                .filter(value -> value % 2 == 0 || value % 3 == 0 || value % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return divisibleNumbers;
    }

}
