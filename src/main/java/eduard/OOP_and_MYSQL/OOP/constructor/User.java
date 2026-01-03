package eduard.OOP_and_MYSQL.OOP.constructor;

import java.util.Arrays;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = new Book[0];
    }

    protected void addBook (Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }
}
