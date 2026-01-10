package eduard.OOP_and_MySQL.MySQL.modification;

public class Task3 {
    public static final String QUERY_1 = "SELECT title FROM movies WHERE title LIKE 'C%';";
    public static final String QUERY_2 = "SELECT quantity, price FROM tickets WHERE price > 30.30;";
    public static final String QUERY_3 = "SELECT quantity, price FROM tickets WHERE quantity > 100;";
    public static final String QUERY_4 = "SELECT title, description, rating FROM movies WHERE rating > 6.5;";
    public static final String QUERY_5 = "SELECT title, description, rating FROM movies ORDER BY rating DESC LIMIT 1;";
}
