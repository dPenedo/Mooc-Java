
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> inputsList = new ArrayList<>();


        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputsList.add(row);
        }
        double average = inputsList.stream()
            .mapToInt(s-> Integer.valueOf(s))
            .average()
            .getAsDouble();


        System.out.println("average of the numbers: " + average);

        scanner.close();
    }
}
