
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> numberList = new ArrayList<>();

        int numberCount = 0;
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                int row = Integer.valueOf(fileScan.nextLine());
                numberList.add(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (Integer integer : numberList) {
            if (integer >= lowerBound && integer <= upperBound) {
                numberCount++;
            }

        }
        System.out.println("Numbers: " + numberCount);

        scanner.close();
    }

}
