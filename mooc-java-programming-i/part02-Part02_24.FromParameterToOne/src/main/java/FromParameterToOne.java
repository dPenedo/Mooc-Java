
public class FromParameterToOne {

    public static void main(String[] args) {

    }

    public static void printFromNumberToOne(int number) {
        int numberOfTimes = number;
        for (int i = 1; i <= number; i++) {
            System.out.println(numberOfTimes);
            numberOfTimes -= 1;
        }
    }

}
