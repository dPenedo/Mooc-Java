

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();
        // String monday = "mon";
        // String tuesday = "tue";
        // String loker = "lllmon";
        //
        // String vocal = "aa";
        // String vowel = "eoeoeoeo";

        String dia = "12:12:12";
        String hora = "22:11:12";
        String lokerDia = "12:12:92";
        String lokerHora = "32:12:12";
        System.out.println(checker.timeOfDay(dia));
        System.out.println(checker.timeOfDay(hora));
        System.out.println(checker.timeOfDay(lokerDia));
        System.out.println(checker.timeOfDay(lokerHora));


    }
}
