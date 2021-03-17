public class Agent {
    private String firstName;
    private String lastName;

    public Agent(String initFirstName, String initLastName) {
        firstName = initFirstName;
        lastName = initLastName;
    }

    public String toString() {
        return "My name is " + firstName + lastName;
    }
}
