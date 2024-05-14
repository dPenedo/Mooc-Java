import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * UserInterface
 */
public class UserInterface {

    private Scanner scanner;
    private BirdRegister birdRegister;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdRegister = new BirdRegister();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("Add")) {
                addBirdUserInterace();

            } else if (command.equals("Observation")) {
                addObservationUserInterface();

            } else if (command.equals("All")) {
                printAll();

            } else if (command.equals("One")) {
                printOne();

            } else if (command.equals("Quit")) {
                break;
            }

        }
    }

    public void addBirdUserInterace() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();
        birdRegister.addBird(name, latinName);
    }
    public void addObservationUserInterface(){
        ArrayList<Bird> listOfBirds = birdRegister.getBirdRegister();
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        boolean birdFound = false;
        for (Bird bird : listOfBirds) {
            if (bird.getName().contains(birdName)) {
                birdRegister.addObservation(birdName);
                birdFound = true;
            }
        }
        if (!birdFound) {
        System.out.println("Not a bird!");
        }
    }
    public void printAll(){
        ArrayList<Bird> listOfBirds = birdRegister.getBirdRegister();
        for (Bird bird : listOfBirds) {
            System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
        }
    }

    public void printOne(){
        ArrayList<Bird> listOfBirds = birdRegister.getBirdRegister();
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        for (Bird bird : listOfBirds) {
            if (bird.getName().equals(birdName)) {
            System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
            }
        }
    }

}
