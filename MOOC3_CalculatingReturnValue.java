import java.util.Scanner;

public class MOOC3_CalculatingReturnValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the third number: ");
        int third = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the fourth number: ");
        int fourth = Integer.valueOf(scanner.nextLine());

        int answer = sum(first, second, third , fourth);
        
        double result = (average(answer));

        System.out.println("The combined sum: " + answer);
        System.out.println("The smallest number: " + smallest(first, second));
        System.out.println("The greatest number: " + greatest(first, second, third));
        System.out.println("The average: " + result);
    }

    public static int sum(int first, int second, int third, int fourth) {
        return first + second + third +fourth;

    }

    public static int smallest(int first, int second) {
        if (first < second) {
            return first;
        }
        else {
            return second;
        }
    }

    public static int greatest(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        }
        else if (second > first && second > third) {
            return second;
        }
        else {
            return third;
        }
    }

    public static double average(double sum) {
        return (sum/4);
    }
}
