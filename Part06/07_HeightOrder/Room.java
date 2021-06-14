import java.util.ArrayList;

public class Room {

    private ArrayList<Person> rooms; 

    public Room() {
        this.rooms = new ArrayList<>();
    }

    public void add(Person person) {
        this.rooms.add(person);
    }

    public boolean isEmpty() {
        if (this.rooms.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.rooms;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }
        
        Person shortest = this.rooms.get(0);

        // for every element in the ArrayList rooms we check to see if that element
        // at that index is shorter than the first index of rooms
        // if it is then that is the shortest person
        for (Person persons: rooms) {
            if (persons.getHeight() < shortest.getHeight()) {
                shortest = persons;
            }
        }

        return shortest;
    }

    public Person take() {
        if (isEmpty()) {
            return null;
        }

        Person isShortest = this.shortest();
        this.rooms.remove(isShortest);
        return isShortest;
    }

}
