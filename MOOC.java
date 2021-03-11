import java.util.Scanner;

public class MOOC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("Enter a number to add up to: ");
        int end = Integer.valueOf(scanner.nextLine());
        int result = 0;
        System.out.println("Enter a number to start from:");
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= end; i++) {
            result += i;
        }
        System.out.println(result);
*/

/*
        // A program that calculates the factorial of a number given by the user
        System.out.println("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(5 * result);
*/

        // Repeating Breaking and Remembering

        int numbers = 0;
        int sum = 0;
        float average = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Enter some numbers: ");

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
        
            if (userInput < 0) {
                System.out.println("Thanks. Bye.");
                break;
            }

            if (userInput > 0) {
               numbers++; 
            }

            if ((userInput | 1) > userInput) {
                even++;
            }
            else {
                odd++;
            }

            sum += userInput;
            average = sum/(float)numbers;
        }

        System.out.println("Sum of all positives: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);


    // Part 2 Methods and dividing the program inot smaller parts

        
        }
}
