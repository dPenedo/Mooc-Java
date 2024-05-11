import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        ArrayList<Integer> listOfPoints = userInterface.askForPoints();
        userInterface.average(listOfPoints);
        userInterface.averageOfPassing(listOfPoints);
        userInterface.passPercentage(listOfPoints);

        // Write your program here -- consider breaking the program into
        // multiple classes.
    }
}
