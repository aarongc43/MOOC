import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(Sytem.in);
        ArrayList<PersonalInformation> personalInformation = new ArrayList<>();

        // Get user name and last name
        while(true) {
            System.out.print("Enter First Name: ");
            String firstName = Scanner.nextLine();

            System.out.println();
            System.out.print("Enter Last Name: ");
            String lastName = Scanner.nextLine();

            System.out.println();
            System.out.print("Enter your ID Number: ");
            int idNumber = Scanner.nextInt();

            if (input.isEmpty()) {
                break;
            }

            // add first & last name with id number
            personalInformation.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        System.out.println();
        for(PersonalInformation personalInformation: personalInformation) {
            System.out.println(personalInformation);
        }
    }
}
