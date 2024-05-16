import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations(){
        this.translations = new HashMap<>();
    }
    public void add(String word, String translation){
        this.translations.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translationList = this.translations.get(word);
        translationList.add(translation);
    }

    public ArrayList<String> translate(String word){
        ArrayList<String> translatedFromWord = new ArrayList<>();
        if (translations.get(word)!= null) {
        translatedFromWord = translations.get(word);
        }

        return translatedFromWord;
    }

    public void remove(String word){
        translations.remove(word);
    }
}
