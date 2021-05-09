import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String file = scanner.nextLine();

        //create array for getting records

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons: ");

        // Loop and call the person method to print each person
        //Person is the type; person is the variabel name; records is the Array name
        for (Person person : records) {
            System.out.println(person);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // scan file, assign name and age
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                // split string up at commas
                String[] pieces = line.split(",");
                // the first element of pieces is the name
                String name = pieces[0];
                // the second element of pieces is the age
                int age = Integer.valueOf(pieces[1]);

                // calling persons arraylist to add name and age
                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }

        return persons;
    }
}
