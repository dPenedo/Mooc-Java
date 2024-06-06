
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> inputs = new ArrayList<>();
        while (true) {
            int row = Integer.valueOf(scanner.nextLine());
            if (row == 111) {
                break;
            }
            inputs.add(row);
        }
        System.out.println(inputs);
        List<Integer> newInputs = positive(inputs);
        System.out.println(newInputs);

        scanner.close();

    }

    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> values = numbers.stream()
            .filter(value -> value > 0)
            .collect(Collectors.toCollection(ArrayList::new));

        return values;
    }


}
