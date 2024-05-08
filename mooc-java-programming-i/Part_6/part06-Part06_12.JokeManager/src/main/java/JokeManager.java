import java.util.ArrayList;
import java.util.Random;

/**
 * JokeManager
 */
public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();

    }

    public void addJoke(String joke) {
        jokes.add(joke);

    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int randomIndex = draw.nextInt(jokes.size());
            System.out.println("Random index " + randomIndex);

            return jokes.get(randomIndex);
        }

    }

    public void printJokes() {
        for (String string : jokes) {
            System.out.println(string);

        }

    }
}
