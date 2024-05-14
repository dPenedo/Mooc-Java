
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPositives = 0;
        int sumOfPositives = 0;
        while (true) {
            String input = scanner.nextLine();
            int inputNumber = Integer.parseInt(input);
            if (inputNumber == 0) {
                if (numberOfPositives>0) {
                    double average = (double) sumOfPositives / numberOfPositives;
                    System.out.println(average);
                    break;
                } else if(numberOfPositives==0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
            } else if (inputNumber >= 0) {
                sumOfPositives += inputNumber;
                numberOfPositives++;
            }
        }
        scanner.close();

    }
}
