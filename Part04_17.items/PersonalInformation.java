import java.util.Scanner;
import java.util.ArrayList;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private int idNumber;

    public void PersonalInformation(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String firstName() {
        return this.firstName;
    }

    public String lastName() {
        return this.lastName;
    }

    public int idNumber() {
        return this.idNumber;
    }

    public String toString() {
        return this.firstName + this.lastName;
    }
}
