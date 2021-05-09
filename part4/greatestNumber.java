import java.util.Scanner;
import java.util.ArrayList;

public class greatestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        Scanner scanned = new Scanner(System.in);
        //Add numbers to ArrayList numberList
        System.out.println("Enter some number to add to the ArrayList numberList: ");
        while (true) {
            int numbers = scanned.nextInt();
            numberList.add(numbers);
            if (numbers == 0) {
                break;
            }
        }
        int zero = numberList.size() - 1;
        numberList.remove(zero);
        //assume first index is smallest number
        int greatest = numberList.get(0);
        int smallest = numberList.get(0);

        //Find greatest number
        System.out.println("Finding the greatest number...");
        for (int i = 0; i < numberList.size() - 1; i++) {
            if (greatest < numberList.get(i)) {
                greatest = numberList.get(i);
            }
            else if (smallest > numberList.get(i)) {
                smallest = numberList.get(i);
            }
        }
        System.out.println("Greatest number: " + greatest + " Index: " + numberList.indexOf(greatest));
        System.out.println("Smallest number: " + smallest + " Index: " + numberList.indexOf(smallest));

        //display values are return the index of that value
        System.out.println("Here are your values: " + numberList);
        System.out.print("What value would you like? ");
        int n = scanned.nextInt();
        System.out.println("Index of: " + n + " - " + numberList.indexOf(n));

        //Get sum of numberList
        int z = 0;
        for (int x: numberList) {
            z += x;
        }
        System.out.println("The sum of the arraylist numberList is: " + z);
    }
}
