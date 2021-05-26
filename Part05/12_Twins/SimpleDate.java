public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object compared) {
        // if variables are located in the same place, they are the same
        if (this == compared) {
            return true;
        }
        
        // if the object is not an instance of SimpleDate, the objects are not the same
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        // cast object
        SimpleDate comparedDate = (SimpleDate) compared;

        // if the object's values are the same the objects are the same
        if (this.day == comparedDate.day &&
            this.month == comparedDate.month &&
            this.year == comparedDate.year) {
            return true;
            }
        return false;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
