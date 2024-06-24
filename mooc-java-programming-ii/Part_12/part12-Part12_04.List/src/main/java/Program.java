
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        List<String> myList = new List<>();
        myList.add("Hello");
        myList.add("Word");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }

    }

}
