import java.util.ArrayList;

/**
 * GradeRegister
 */
public class GradeRegister {

    private ArrayList<Integer> grades;

    public GradeRegister(){
        this.grades = new ArrayList<>();
    }

    public int pointsToGrades(int points){
        int grade = 0;
        if (points < 50 ){
            grade = 0;
        } else if (points < 60){
            grade = 1;
        } else if (points < 70){
            grade = 2;
        } else if (points < 80){
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else{
            grade = 5;
        }
        return grade;
    }

    public ArrayList<Integer> storeGradesFromPoints(ArrayList<Integer> listOfPoints){
        for (Integer points : listOfPoints) {
            int grade = this.pointsToGrades(points);
            this.grades.add(grade);
        }
        return this.grades;
    }


    public static void printGradeDistribution(ArrayList<Integer> listOfGrades) {
        System.out.println("Grade distribution:");
        int gradesDistribution[] = new int[6];

        for (Integer grade : listOfGrades) {
            gradesDistribution[grade]++;
        }

        for (int i = 5; i >= 0; i--) {
            int grade = i;
            System.out.print(grade + ": ");
            printStars(gradesDistribution[i]);
            System.out.println("");

        }
    }

    private static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;

        }
    }
}
