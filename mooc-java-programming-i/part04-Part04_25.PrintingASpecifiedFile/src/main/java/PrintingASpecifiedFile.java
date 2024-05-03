
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String inputFile = scanner.nextLine();
        // if (inputFile.equals("song.txt")) {

            try (Scanner scannerSong = new Scanner(Paths.get(inputFile))){
                while (scannerSong.hasNextLine()) {
                    String row = scannerSong.nextLine();
                    System.out.println(row);
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

    }
}
