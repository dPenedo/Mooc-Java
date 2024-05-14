
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("loco1", "El pelanas");
        hashMap.put("loco2", "El loker");
        hashMap.put("loco3", "El mandangas");
        hashMap.put("loco4", "El rulas");
        hashMap.put("loco5", "El tramboliko");
        printKeysWhere(hashMap, "loco1");
    }
    public static void printKeys(HashMap<String, String> hashMap){
        for (String string : hashMap.keySet()) {
            System.out.println(string);
        }

    }
    public static void printKeysWhere(HashMap<String, String> hashMap, String text){
        for (String string : hashMap.keySet()) {
            if (string.contains(text)) {
            System.out.println(string);

            }

        }

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text){
        for (String string : hashMap.keySet()) {
            if (string.contains(text)) {
                System.out.println(hashMap.get(string));
            }
        }

    }

}
