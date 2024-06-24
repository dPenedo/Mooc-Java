
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test the class here
		// Pair<String, String> elPair = new Pair<> ("lalal", "lololo");
		// System.out.println(elPair.getKey() + " --> " + elPair.getValue());
		// HashMap elHashMap = new HashMap<>();
		// elHashMap.add(elPair.getKey(), elPair.getValue());
		// System.out.println("El hashmap es " + elHashMap.get("lalal"));
		// elHashMap.remove("lalal");
		// System.out.println("El hashmap es " + elHashMap.get("lalal"));
		        List<String> myList = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();

        // Añadir elementos a la lista y al mapa hash
        for (int i = 0; i < 1000000; i++) {
            myList.add("" + i);
            hashMap.put("" + i, "" + i);
        }

        // Crear una lista de elementos a buscar
        List<String> elements = new ArrayList<>();
        Random randomizer = new Random();
        for (int i = 0; i < 1000; i++) {
            elements.add("" + randomizer.nextInt(2000000));
        }

        // Medir el tiempo de búsqueda en la lista
        long listSearchStartTime = System.nanoTime();
        for (int i = 0; i < elements.size(); i++) {
            myList.contains(elements.get(i));
        }
        long listSearchEndTime = System.nanoTime();

        // Medir el tiempo de búsqueda en el mapa hash
        long hashMapSearchStartTime = System.nanoTime();
        for (int i = 0; i < elements.size(); i++) {
            hashMap.get(elements.get(i));
        }
        long hashMapSearchEndTime = System.nanoTime();

        // Calcular y mostrar los tiempos de búsqueda
        long listSearch = listSearchEndTime - listSearchStartTime;
        System.out.println("List: the search took about " + listSearch / 1000000 + " milliseconds (" +
            listSearch + " nanoseconds.)");

        long hashMapSearch = hashMapSearchEndTime - hashMapSearchStartTime;
        System.out.println("Hash map: the search took about " + hashMapSearch / 1000000 +
            " milliseconds (" + hashMapSearch + " nanoseconds.)");

    }

}
