package eduard.OOP_and_MySQL.MySQL.jointable;

public class Task1 {
    public static final String QUERY_1 = "SELECT t.*, p.type FROM tickets AS t\n" +
            "    JOIN payments AS p\n" +
            "    ON t.id = p.id\n" +
            "        WHERE type = 'cash';";

    public static final String QUERY_2 = "SELECT title, rating FROM movies AS m\n" +
            "    JOIN cinemas_movies cm on m.id = cm.movie_id\n" +
            "    JOIN cinemas AS c\n" +
            "    ON cm.cinema_id = c.id\n" +
            "    WHERE c.id = 2;";
}
