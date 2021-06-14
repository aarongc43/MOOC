import java.util.ArrayList;

public class stack {
    private ArrayList<String> values;

    public stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (values.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        values.add(value);
    }

    public ArrayList<String> values() {
        return values;
    }

    public String take() {
        return values.remove(values.size() - 1);
    }
}
