import java.util.Scanner;
import java.util.ArrayList;

public class MOOC_lists {
    public static void main(String[] args) {
        // create an array list
        // Variables can be divided into two type: Value and reference types.
        // Value-Type variables hold their actual value
        // Reference-Type variables such as ArrayList, contain a reference to the location
        // that contains the value of the variable

        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanned = new Scanner(System.in);

        System.out.println("Enter some names: ");
        System.out.println("(Pressing 'return' will list the names)");

        //Put data into an ArrayList
        while (true) {
            String names = scanned.nextLine();
            nameList.add(names);

            if (names == "") {
                break;
            }
        }
        System.out.println(nameList.get(2));

        //Put data into an ArrayList
        System.out.println("Enter at least 5 numbers: \n(Entering a '0' will perform calculation");
        ArrayList<Integer> numberList = new ArrayList<>();
        while (true) {
            int numbers = scanned.nextInt();
            numberList.add(numbers);

            if (numbers == -1) {
                break;
            }
        }

        //Get two ints and determine their sum
        int sum0 = numberList.get(2);
        int sum1 = numberList.get(0);
        System.out.println("sum of first and third numbers is: " + (sum0 + sum1));

        //Print out all values of an ArrayList
        for (int i = 0; i < numberList.size() - 1; i++) {
            System.out.println(numberList.get(i));
        }

        System.out.println("values in numerList in reverse");
        //Print out all values in reverse order
        for (int i = numberList.size() - 2; i >= 0; i--) {
            System.out.println(numberList.get(i));
        }

        //Get size of ArrayLists
        System.out.println("namesList ArrayList size: " + nameList.size());
        System.out.println("numberList ArrayList size: " + numberList.size());

        //Print values of index from 'start' to 'end'
        System.out.println("What index would you like to start at?\n Start: ");
        int start = scanned.nextInt();
        System.out.println("End: ");
        int end = scanned.nextInt();

        System.out.println("The index you want to start at is " + start + " and the index you want to end at is " + end);
        System.out.println("The values are: ");

        for (int i = start; i <= end; i++) {
            System.out.println(numberList.get(i));
        }

        int greatest = numberList.get(0);
        int smallest = numberList.get(0);
        //Find smallest number
        for (int i = 0; i < numberList.size(); i++) {
            int number = numberList.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("The smallest number is: " + smallest);

        // Find greatest number
        for (int i = 0; i < numberList.size(); i++) {
            int number = numberList.get(i);
            if (number > greatest) {
                greatest = number;
            }
        }
        System.out.println("The greatest number is: " + greatest);
    }
}
