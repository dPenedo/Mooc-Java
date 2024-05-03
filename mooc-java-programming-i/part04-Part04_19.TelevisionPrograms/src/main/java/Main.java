import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String inputName = scanner.nextLine();
            if (inputName.equals("")) {
                break;
            }
            System.out.print("Duration: ");

            int inputDuration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(inputName, inputDuration));
        }
        System.out.println("Program's maximun duration?");
        int maxDurationInput = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram televisionProgram : programs) {
            if(televisionProgram.getDuration()<= maxDurationInput){
           System.out.println(televisionProgram.toString());
            }
        }

    }
}
