
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // https://java-programming.mooc.fi/part-1/5-calculating
        System.out.println("How many days would you like to convert to seconds?");
        int integerValue = Integer.valueOf(scanner.nextLine());
        int numberOfSeconds = integerValue * 60 * 60 * 24;
        System.out.println(numberOfSeconds);
    }
}
