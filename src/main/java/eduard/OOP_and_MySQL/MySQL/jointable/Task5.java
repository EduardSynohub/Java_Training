package eduard.OOP_and_MySQL.MySQL.jointable;

public class Task5 {
    public static final String QUERY_1 = "SELECT c.name, m.title FROM cinemas c\n" +
            "    JOIN cinemas_movies cm ON c.id = cm.cinema_id\n" +
            "    JOIN movies m on m.id = cm.movie_id\n" +
            "        WHERE m.id = 1;";
    public static final String QUERY_2 = "SELECT m.title, c.name FROM movies m\n" +
            "    JOIN cinemas_movies cm ON m.id = cm.movie_id\n" +
            "    JOIN cinemas c ON c.id = cm.cinema_id\n" +
            "        WHERE c.id = 1;";
}
