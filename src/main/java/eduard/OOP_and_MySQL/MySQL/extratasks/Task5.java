package eduard.OOP_and_MySQL.MySQL.extratasks;

public class Task5 {
    public static final String QUERY = "CREATE TABLE screenings (\n" +
            "    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
            "    cinema_id INT NOT NULL,\n" +
            "    movie_id INT NOT NULL,\n" +
            "    show_time DATETIME NOT NULL,\n" +
            "\n" +
            "    CONSTRAINT fk_screenings_cinema\n" +
            "        FOREIGN KEY (cinema_id) REFERENCES cinemas(id)\n" +
            "            ON DELETE CASCADE,\n" +
            "\n" +
            "    CONSTRAINT fk_screenings_movies\n" +
            "        FOREIGN KEY (movie_id) REFERENCES movies(id)\n" +
            "            ON DELETE CASCADE,\n" +
            "\n" +
            "    UNIQUE (cinema_id, movie_id, show_time)\n" +
            ")";
}
