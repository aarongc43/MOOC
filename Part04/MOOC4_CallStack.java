import java.util.Scanner;

//Execution of Method Calls and the Call Stack

public class MOOC4_CallStack {
    public static void main(String[] args) {
        multiplicationTable(10);
    }
        
        public static void multiplicationTable(int max) {
            int number = 1;

            while (number <= max) {
                printMultiplicationTableRow(number, max);
                number++;
                }
            }

        public static void printMultiplicationTableRow(int number, int coefficient) {
            int printable = number;
            while (printable <= number * coefficient) {
                System.out.print(" " + printable);
                printable += number;
            }
            System.out.println("");
        }
}
