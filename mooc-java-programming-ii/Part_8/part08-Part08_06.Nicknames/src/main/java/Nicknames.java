
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("Mathew", "Matt");
        nicknames.put("Michael", "Mix");
        nicknames.put("Arthur", "Artie");
        System.out.println(nicknames.get("Michael"));
    }

}
