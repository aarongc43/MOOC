import java.util.Scanner;
import java.util.ArrayList;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private String idNumber;

    public PersonalInformation(String firstName, String lastName, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public String toString() {
        return this.firstName + this.lastName + "ID: " + this.idNumber;
    }
}
