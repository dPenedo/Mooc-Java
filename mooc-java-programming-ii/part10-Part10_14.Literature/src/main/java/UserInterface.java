import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * UserInterface
 */
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Book> bookList;
    private long numberOfBooks;


    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.bookList = new ArrayList<>();
        this.numberOfBooks = bookList.stream()
            .count();
    }

    public void start() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if (title.trim().equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int recommendedAge = Integer.valueOf(scanner.nextLine());
            Book newBook = new Book(title, recommendedAge);
            bookList.add(newBook);
        }
        this.numberOfBooks = bookList.stream()
                .count();
        System.out.println();
        System.out.println(this.numberOfBooks + " books in total.");
        System.out.println();
        System.out.println("Books:");
        ArrayList<Book> sortedList = sortedList(bookList);
        for (Book book : sortedList) {
            System.out.println(book);
        }
    }
    public ArrayList<Book> sortedList(ArrayList<Book> listToSort){
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecomendedAge)
                .thenComparing(Book::getTitle);
        Collections.sort(listToSort, comparator);
        ArrayList<Book> sortedList = new ArrayList<Book>();
        sortedList = listToSort;
        return sortedList;
    }
}
