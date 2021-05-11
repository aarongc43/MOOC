import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the length of cube: ");
        int length = scan.nextInt();
        Cube cube1 = new Cube(length);

        System.out.println(cube1.volume());
        System.out.println(cube1);
    }

}
