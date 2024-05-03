import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack pila = new Stack();
        pila.add("uno");
        pila.add("dos");
        pila.add("tres");
        pila.add("cuatro");
        System.out.println(pila.isEmpty());
        System.out.println(pila.values());
        System.out.println(pila.take());
        System.out.println(pila.values());



    }
}
