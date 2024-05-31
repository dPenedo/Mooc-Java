
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputList.add(row);
        }

        double averageOfPositive = inputList.stream()
            .mapToInt(s -> Integer.valueOf(s) )
            .filter(number -> number > 0)
            .average()
            .getAsDouble();

        double averageOfNegative = inputList.stream()
            .mapToInt(s -> Integer.valueOf(s) )
            .filter(number -> number < 0)
            .average()
            .getAsDouble();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String nOrP = scanner.nextLine();
        if (nOrP.equals("n")) {
            System.out.println("Average of the negative numbers: " + averageOfNegative);
        } else if (nOrP.equals("p")){
            System.out.println("Average of the positive numbers: " + averageOfPositive);
        }


        scanner.close();


    }
}
