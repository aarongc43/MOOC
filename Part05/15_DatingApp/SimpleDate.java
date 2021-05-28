public class SimpleDate {

    private int month;
    private int day;
    private int year;

    public SimpleDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if years are the same compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // if years and months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
                }

        return false;
    }

    public void advance() {
        // moves date by one day. assume each month is 30 days
        if (this.day < 31) {
            this.day++;
        } else {
            this.day = 1;

            if (this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void advance(int howManyDays) {
        // call advance n times
        while (howManyDays > 0) {
            // advacne the day variable
            advance();
            //subtract from howManyDays until 0 to break loop
            howManyDays--;
        }
    }

    // Add ability to advance time to the SimpleDate class
    public SimpleDate afterNumberOfDays(int days) {
        // creates a new object inside of the method that uses values called in the main function
        SimpleDate newDate = new SimpleDate(this.month, this.day, this.year);

        // new object will call advance by n times
        newDate.advance(days);

        //returns new SimpleDate object to main function after all methods have been performed
        return newDate;
    }
}
