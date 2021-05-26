public class Main {

    public static void main(String[] args) {
        
        // create birthdates
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        // create people
        Person leo = new Person ("Leo", date, 62, 9);
        Person lily = new Person ("Lily", date2, 65, 8);

        // Check if leo and lily are equal
        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }
        
        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        // check if new leo and lily are equal
        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }

    }
}
