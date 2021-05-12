import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private String name;
    private LocalDateTime createdAt;

    public Item (String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getItem () {
        return this.name;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM.yyyy HH:mm:ss");

        return "Item: " + this.name + " (created at: " + formatter.format(this.createdAt) + ")";
    }

    public boolean isEmpty() {
        return this.name == "";
    }
}
