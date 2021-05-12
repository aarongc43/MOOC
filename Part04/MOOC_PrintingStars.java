import java.util.Scanner;

public class MOOC_PrintingStars{
 
    public static void printStars(int number) {
        int i = 0;

        while (i < number) {
            System.out.print("*");
            i++;
        } 
    }
    
    public static void printSquare(int size) {
        int i = 0;
        int j = 0;
        while (i <= size && j < size) {
            printStars(size);
            System.out.println("");
            j++;
        }
    }

    public static void printRectangle(int height, int length) {
        for (int j = 0; j < height; j++) {
        for (int i = 0; i < length; i++)
            System.out.print("*");
            System.out.println();
        }
    }

    public static void printLeftTriangle(int size) {
        int i = 0;
        while (size >= i) {
            printStars(i);
            System.out.println("");
            i++;
        } 
    }

    public static void printRightTriangle(int size) {
        int i = 0;
        int j = size;
        while (size >= i) {
            printSpaces(j);
            printStars(i);
            System.out.println("");
            i++;
            j--;
        }     
    }
    
    public static void printSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        } 
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) 
            System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
            System.out.print("*");
            System.out.println();
        }
        for (int m = 0; m < 2; m++) {
            for (double l = 0; l <= (height/1.5); l++)
                System.out.print(" ");
                printStars(3);
                System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //printStars(5);
        //printSquare(4);
        printRectangle(2,3);
        //printLeftTriangle(6);
        //printRightTriangle(6);
        christmasTree(6);
    }
}
