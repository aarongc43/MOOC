public class Containers {

    private int level;

    public Containers() {
        this.level = level;
    }

    public int contains() {
        return this.level;
    }

    public void add(int amount) {
        if ((amount > 0) && this.level + amount <= 100) {
            this.level += amount;
        } else if (amount > 0 && this.level + amount > 100) {
            this.level = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.level -= amount;
        }

        if (this.level < 0) {
            this.level = 0;
        }
    }

    public String toString() {
        return this.level + "/100";
    }
}
