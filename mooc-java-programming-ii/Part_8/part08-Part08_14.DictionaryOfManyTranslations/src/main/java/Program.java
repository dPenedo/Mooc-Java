
public class Program {

    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
       DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
       dictionary.add("lie", "mentira");
       dictionary.add("lie", "chamuyo");

       dictionary.add("bow", "arco");
       dictionary.add("bow", "tiradorDeFlechas");

       System.out.println(dictionary.translate("lie"));
       dictionary.remove("bow");
       System.out.println(dictionary.translate("bow"));
    }
}
