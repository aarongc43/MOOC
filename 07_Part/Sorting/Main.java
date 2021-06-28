import java.util.Arrays;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int[] numbers ={-1, 6, 9, 8, 12, -54, 23, 10, 45, -234, 500, 600, 230, 23, 0, 1, -1, 13};

        System.out.println("Smallest: " + Main.smallest(numbers));
        System.out.println("Index of the smallest number: " + Main.indexOfSmallest(numbers));
        System.out.println();

        System.out.println("Index of the smallest number: " + Main.indexOfSmallestFrom(numbers, 0));
        System.out.println("Index of the smallest number: " + Main.indexOfSmallestFrom(numbers, 1));
        System.out.println("Index of the smallest number: " + Main.indexOfSmallestFrom(numbers, 2));
        System.out.println();

        System.out.println(Arrays.toString(numbers));

        Main.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));
        
        Main.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        Main.sort(numbers);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    public static int smallest(int[] array) {
        int x = array[0];

        for (int value: array) {
            if (x > value) {
                x = value;
            }
        }

        return x;
    }

    public static int indexOfSmallest(int[] array) {
        int x = Main.smallest(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] array, int start) {
        int x = start;
        int[] subArray = new int[array.length - start];

        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = array[x];
            x++;
        }
        return start + indexOfSmallest(subArray);
    }

    public static void swap(int[] array, int index1, int index2) {
        int x = array[index1];

        array[index1] = array[index2];
        array[index2] = x;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}



















































