public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getName() {
        return title;
    }

    public boolean equals(Object compared) {
        // if variables are located in the same position
        if (this == compared) {
            return true;
        }

        // if comapared object is not of type Book, Objects are not equal
        if (!(compared instanceof Book)) {
            return false;
        }

        // convert object to a book object
        Book comparedBook = (Book) compared;

        // if values of the object variables are equal, the objects are, too
        return this.title.equals(comparedBook.title);
    }
}
