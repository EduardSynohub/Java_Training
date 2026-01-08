package eduard.OOP_and_MySQL.OOP.constructor;


public class TestBook {
    public static void main(String[] args) {
        Author rowling = new Author("J.K.", "Rowling", null);
        User user = new User("Forrest", "Gump");
        Book harryPotter1 = new Book(123, "Harry Potter and the philosopher`s stone", rowling);
        Book harryPotter2 = new Book(345, "Harry Potter and the chamber of secrets", rowling);

        user.addBook(harryPotter1);
        user.addBook(harryPotter2);
        System.out.println(user);
        System.out.println("--------------------------------------");

        user.returnBook(harryPotter1);
        System.out.println(user);
        System.out.println("--------------------------------------");

        System.out.println(harryPotter1);
        System.out.println("--------------------------------------");

        user.addBook(harryPotter1);
        user.returnBook(harryPotter1);
        System.out.println(harryPotter1);
        System.out.println("--------------------------------------");

        user.returnAllBooks();
        System.out.println(user);
    }
}
