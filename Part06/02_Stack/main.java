// Create a stack class that has a list of strings as an insance variable.

public class main {
    public static void main(String[] args) {
        stack s = new stack();

        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
