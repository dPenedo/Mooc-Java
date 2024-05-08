
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private int sumOfGrades = 0;
    private int sumOfPoints = 0;
    private int numberOfValues = 0;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.sumOfGrades += pointsToGrade(points);
        this.sumOfPoints += points;
        this.numberOfValues++;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }
        Double averageOfGrades = (double) sumOfGrades / numberOfValues;
        return averageOfGrades;
    }
    public double averageOfPoints(){
        if (grades.isEmpty()) {
            return -1;
        }
        Double averageOfPoints = (double) sumOfPoints / numberOfValues;
        return averageOfPoints;

    }
}
