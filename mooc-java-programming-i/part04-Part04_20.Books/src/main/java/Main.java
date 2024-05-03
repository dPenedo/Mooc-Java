import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Title:");
            String inputTitle = scanner.nextLine();
            if (inputTitle.equals("")) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(inputTitle, pages, publicationYear));
        }
        System.out.println("What information will be printed?");
        String infoToPrint = scanner.nextLine();
        if (infoToPrint.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
        if (infoToPrint.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getName());
            }

        }

        scanner.close();

    }
}
