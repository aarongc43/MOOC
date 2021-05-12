import java.util.Scanner;


public class MOOC2 {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);

        System.out.printf("Enter a nunmber: ");
        int times = Integer.valueOf(scanned.nextLine());
        printNumCountDown(times);

        sum(3,5);
        int number1 = 2;
        int number2 = 4;
        sum(number1,number2);

        division(10,7);

        divisibleByThree(1,30);

        int number = 1;
        System.out.println("The value 'number' in the main program: " + number);
        incrementByThree(number);
        System.out.println("The value of the varible 'number' in the main program: " + number);
    }

// Print from a number to 0
    public static void printNumCountDown(int times) {
        while (times >= 0) {
            System.out.println(times);
            times--;
            }
    }

    public static void sum(int first, int second) {
    System.out.println("The sum of numbers " + first + " and " + second + " is "
            + (first + second));
    }

    public static void division(int numerator, int denominator) {
    System.out.println("The divisor of numbers " + numerator + " and " + denominator + " is " 
            + (numerator/denominator)); 
   
    }

    public static void divisibleByThree(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
            System.out.println(i + " is divisible by 3");
            } 
        }
    }

    public static void incrementByThree(int number) {
        System.out.println("The value of the method parameter 'number': " + number);
        number = number + 3;
        System.out.println("The value of the method parameter 'number': " + number);
    }
    
    public static int methodTheReturnsInteger(){
        //body, return statement included
    }

    public static double methodThatReturnsFloatingPointNumber(){
        // body, return statemnt included
    }

   // Defining variables inside of methods
   public static void main(String[] args) {
        Scanner scanner = new Scanner(Sytem.in);

        System.out.println("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the third number: ");
        int third = Integer.valueOf(scanner.nextLine());

        double averageResult = average(first. second, third);
        System.out.println("The average of numbers: " + averageResult);
   
   }
   public static double average(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        double avg = sum / 3.0;

        return avg;
   
   } 

    // Calculating Return Value Inside a Method
    
}
