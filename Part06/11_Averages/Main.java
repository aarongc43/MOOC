import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
