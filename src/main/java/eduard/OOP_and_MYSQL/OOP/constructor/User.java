package eduard.OOP_and_MYSQL.OOP.constructor;

import java.util.Arrays;

public class User extends Person{
    private Book[] books;

    public User(String name, String surname) {
        super(name, surname);
        this.books = new Book[0];
    }


    protected void addBook (Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
        book.borrow();
    }

    protected void returnBook(Book book) {
        Book[] toRemoveBook = new Book[0];

        for (Book value : books) {
            if (!book.equals(value)) {
                toRemoveBook = Arrays.copyOf(toRemoveBook, toRemoveBook.length + 1);
                toRemoveBook[toRemoveBook.length - 1] = value;
            } else {
                value.setAvailable(true);
            }
        }

        books = toRemoveBook;
    }

    public void returnAllBooks() {
        for (Book book : books) {
            book.setAvailable(true);
        }

        books = new Book[0];
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "User{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
