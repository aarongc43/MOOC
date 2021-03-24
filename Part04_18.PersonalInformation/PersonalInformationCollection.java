import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> personalInformation = new ArrayList<>();

        // Get user name and last name
        while(true) {
            System.out.print("Enter First Name: ");
            String firstName = Scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Enter Last Name: ");
            String lastName = Scanner.nextLine();

            System.out.print("Enter your ID Number: ");
            String idNumber = Scanner.nextLine();

            // add first & last name with id number
            personalInformation.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        System.out.println();
        for(PersonalInformation PersonalInformation: personalInformation) {
            System.out.print(PersonalInformation.getFirstName() + " " + PersonalInformation.getLastName());
            System.out.println("Your ID has been generated as: " + PersonalInformation.getIdNumber());
        }
    }
}
