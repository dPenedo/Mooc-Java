

public class Checker {
    public Checker(){}
    public boolean isDayOfWeek(String string){
        String regex = "[a-z]{3}";
        if (string.matches(regex)) {
            return true;
        }
        return false;
    }
    public boolean allVowels(String string){
        String regex = "[a|e|i|o|u]*";
        if (string.matches(regex)) {
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string){
        String regex = "([0-2][0-3]|[0-1][0-9]):[0-5][0-9]:[0-5][0-9]";
        // String regex = "([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";

        if (string.matches(regex)) {
            return true;
        }
        return false;
    }

}
