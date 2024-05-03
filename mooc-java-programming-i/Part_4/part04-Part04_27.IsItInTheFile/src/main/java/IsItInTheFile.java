
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> listOfStrings = new ArrayList<>();
        System.out.println("Search for:");
        String stringToSearch = scanner.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(file))){
                while (fileScan.hasNextLine()) {
                String row = fileScan.nextLine();
                listOfStrings.add(row);
                }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        if (listOfStrings.contains(stringToSearch)) {
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }

    }
}
