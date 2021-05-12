import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> tvNames = new ArrayList<>();

        // read television program from a user
        System.out.println("Enter your favorite shows.");

        while (true) {
            System.out.print("Name: \n");
            String name = Scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(Scanner.nextLine());
            
            tvNames.add(new TelevisionProgram(name, duration));
        }

        System.out.println();
        System.out.println("What is the maximun duration?");
        int maxDuration = Integer.valueOf(Scanner.nextLine());

        for (TelevisionProgram TelevisionProgram : tvNames) {
            if (TelevisionProgram.getDuration() <= maxDuration) {
            System.out.println("Your favorite shows are " + TelevisionProgram.getName()+ "\nDuration is: " + TelevisionProgram.getDuration());
            }
        }
    }
}
