import java.util.Scanner;
import java.util.ArrayList;

public class moocLists2
{
    public static void removeLast(ArrayList<Integer> list)
    {
        if (list.size() == 0)
        {
            return;
        }

        int i = list.size() - 1;
        list.remove(i);
    }

    public static void print(ArrayList<Integer> list)
    {
        for (Integer value: list)
        {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public static void printSmallerThan(ArrayList<Integer> list, int threshold)
    {
        for (int number: list)
        {
            if (number < threshold)
            {
                System.out.print(number);
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printRange(ArrayList<Integer> list, int lowerLimit, int upperLimit)
    {
        for (int number: list)
        {
            if (number > lowerLimit && number < upperLimit)
            {
                System.out.print(number);
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static double sum(ArrayList<Integer> list)
    {
        int sum = 0;

        for (int number: list)
        {
            sum = sum + number;
        }

        return sum;
    }

    public static void main(String args[])
    {
        Scanner scanned = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("Enter a few numbers(enter -1 to stop): ");
        while (true)
        {
            int nums = scanned.nextInt();
            numberList.add(nums);

            if (nums == -1)
            {
                break;
            }
        }
        int i = numberList.size() - 1;
        numberList.remove(Integer.valueOf(i));

        //gets sum and average of numberList
        double sum = 0;
        for (int nums: numberList)
        {
            sum = sum + nums;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/numberList.size());

        System.out.print("Enter a number to find it in the List: ");
        int found = scanned.nextInt();
        if (numberList.contains(Integer.valueOf(found)))
            {
                System.out.println("There is an integer of " + found);
            }

        print(numberList);

        System.out.print("Enter a number to print up to: ");
        int threshold = scanned.nextInt();
        printSmallerThan(numberList, threshold);

        System.out.print("Enter a range to print numbers\nUpper:");
        int upper = scanned.nextInt();
        System.out.print("Lower: ");
        int lower = scanned.nextInt();
        printRange(numberList, lower, upper);

        System.out.println("This method gets the sum of all the numbers in the list." + sum(numberList));

        removeLast(numberList);
        System.out.println("Removing the last value" + numberList);
    }
}
