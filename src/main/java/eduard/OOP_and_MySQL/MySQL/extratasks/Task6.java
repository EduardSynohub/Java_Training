package eduard.OOP_and_MySQL.MySQL.extratasks;

public class Task6 {
    public static final String QUERY = "SELECT m.title, m.description, m.rating, c.name FROM movies m\n" +
            "    JOIN screenings s on m.id = s.movie_id\n" +
            "    JOIN cinemas c on c.id = s.cinema_id";
}
