import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        ArrayList<Integer> listOfPoints = userInterface.askForPoints();
        GradeRegister gradeRegister = new GradeRegister();
        ArrayList<Integer> listOfGrades = gradeRegister.storeGradesFromPoints(listOfPoints);

        Calculator calculator = new Calculator();
        calculator.average(listOfPoints);
        calculator.averageOfPassing(listOfPoints);
        calculator.passPercentage(listOfPoints);
        gradeRegister.printGradeDistribution(listOfGrades);

    }
}
