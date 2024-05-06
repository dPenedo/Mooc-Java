import java.util.ArrayList;

/**
 * JokeManager
 */
public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager(){

    }
    public void addJoke(String joke){
        jokes.add(joke);

    }
    public String drawJoke(){
        if (jokes.isEmpty()) {
        return "Jokes are in short supply.";
        }
        int randomIndex = (int) Math.random() * jokes.size();
        return jokes.get(randomIndex);

    }

    public void printJokes(){
        for (String string : jokes) {
            System.out.println(string);

        }

    }
}
