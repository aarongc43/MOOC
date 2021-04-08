import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;

        while(true) {
            String line = scanner.nextLine();

            num++;

            if (line.equals("end")) {
                break;
            }

            int number = Integer.valueOf(line);
            int cube;

            cube = number*number*number;

            System.out.println(cube);
        }

        System.out.println(num);
    }
}
