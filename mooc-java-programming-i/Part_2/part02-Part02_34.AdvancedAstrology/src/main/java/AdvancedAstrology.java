
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int triangleSpaces = size - 1;
        int triangleStars = 1;

        for (int i = 0; i < size; i++) {
            printSpaces(triangleSpaces);
            printStars(triangleStars);
            triangleSpaces -= 1;
            triangleStars++;

        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int treeSpaces = height - 1;
        int treeStars = 1;
        for (int i = 0; i < height; i++) {
            printSpaces(treeSpaces);
            printStars(treeStars);
            treeSpaces -= 1;
            treeStars += 2;
        }

        // tree trunk
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        christmasTree(10);
        // System.out.println("---");
        // christmasTree(4);
        // System.out.println("---");
        // christmasTree(10);
    }
}
