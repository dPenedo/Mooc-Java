
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();

        while (true) {
            Integer intRow = Integer.parseInt(scanner.nextLine());
            if (intRow<0) {
                break;
            }
            inputList.add(intRow);
        }

        ArrayList<Integer> numbersBetween1And5 =  inputList.stream()
            .filter(number -> number > 0 && number <=5)
            .collect(Collectors.toCollection(ArrayList::new));

        numbersBetween1And5.stream()
            .forEach(number -> System.out.println(number));


        scanner.close();
    }
}
