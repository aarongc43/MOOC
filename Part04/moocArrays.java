// They array is an ancestor of the array list
// An array has a limited amount of numbered spots for values
// length or size of the array is the amount of these spots i.e., how many values you can place in the Array
// The values in an Array are called elements

import java.util.Scanner;

public class moocArrays {
    //Arrays can be used in the parameter of a method
    public static void listElements(int[] intArray) {
        System.out.println("The elements of the array are: ");
        if (intArray.length >= 1) {
            System.out.print(intArray[0]);
        }
        for (int i = 1; i < intArray.length; i++) {
            int number = intArray[i];
            System.out.print(", " + number);
        }
        System.out.println("");
    }
    public static void arraySum(int[] intArray) {
        System.out.println("The sum of your array is: ");
        int sum = 0;
        for (int number: intArray) {
            sum = sum + number;
        }
        System.out.print(sum);
        System.out.println("");
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        String[] months = new String[12];
        double[] approximations = new double[100];

        // Create a custome sized array
        System.out.println("Enter a number for the size of an array: ");
        int sizeArray = Integer.valueOf(scanner.nextLine());

        int[] numbers = new int[sizeArray];
        // Entering data into array 
        System.out.println("Enter numbers into the array: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("The array has " + numbers.length + " elemenmts.");
        for (int number: numbers) {
            System.out.println(number);
        }

        // swap array element values
        System.out.println("Give two indicies to swap: ");
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());

        int helper = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = helper;

        System.out.println("Array after modification is: ");
        for (int number: numbers) {
            System.out.println(number);
        }

        // Search for an element in the array
        System.out.println("Search for index? ");
        int search = Integer.valueOf(scanner.nextLine());
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                found = true;
            }
            else if (found == true) {
                System.out.println(search + " was found at " + i);
                break;
            }
            else {
                found = false;
            }
        }
        if (found == false) {
            System.out.println(search + " was not found");
        }

        listElements(numbers);
        arraySum(numbers);

    }
}
