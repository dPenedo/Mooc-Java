
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = { 3, -5, 6, -19, 7, 1, 3, 7, 5 };
        //
        // int[] numbers = { 6, 3, 0, -1, 4 };
        // System.out.println("Index of the smallest number: of 3, -5, 6, -19, 7, 1, 3,
        // 7, 5 \n"
        // + MainProgram.indexOfSmallest(array));
        // System.out
        // .println("Index of the smallest number: of 6, 3, 0, -1, 4 \n" +
        // MainProgram.indexOfSmallest(numbers));
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        for (int i : numbers) {
            System.out.print(i);
        }
        System.out.println("\n=============");
        MainProgram.sort(numbers);
        for (int i : numbers) {
            System.out.print(i);
        }
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int index1Number = 0;
        int index2Number = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index1) {
                index1Number = array[index1];
            }
            if (i == index2) {
                index2Number = array[index2];
            }
        }
        array[index1] = index2Number;
        array[index2] = index1Number;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
