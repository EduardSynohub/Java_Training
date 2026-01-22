package eduard.OOP_and_MySQL.MySQL.extratasks;

public class Task7 {
    public static final String QUERY_1 = "SELECT * FROM cinemas";
    public static final String QUERY_2 = "SELECT m.title, m.description, m.rating, c.name FROM movies m\n" +
            "    JOIN cinemas_movies cm on m.id = cm.movie_id\n" +
            "    JOIN cinemas c on cm.cinema_id = c.id\n" +
            "        WHERE c.id = 5";
    public static final String QUERY_3 = "SELECT m.title, s.show_time FROM movies m\n" +
            "    JOIN screenings s on m.id = s.movie_id";
}
