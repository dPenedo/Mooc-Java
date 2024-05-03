
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) {
                break;
            }
            int inputInteger = Integer.valueOf(inputString);
            int cubeOfIntegers = inputInteger*inputInteger*inputInteger;
            System.out.println(cubeOfIntegers);

        }

    }
}
