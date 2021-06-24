import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> toDoList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
    }

    public void add(String task) {
        toDoList.add(task);
    }

    public void print() {
        int x = 0;
        int counter = 0;

        while (counter < toDoList.size()) {
            System.out.print(x + 1 + ": ");
            System.out.println(toDoList.get(x));
            x++;
            counter++;
        }
    }

    public void remove(int number) {
       toDoList.remove(number - 1); 
    }
}
