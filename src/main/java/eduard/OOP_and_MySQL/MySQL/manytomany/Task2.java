package eduard.OOP_and_MySQL.MySQL.manytomany;

public class Task2 {
    public static final String QUERY = "USE cinemas_ex;\n" +
            "\n" +
            "CREATE TABLE cinemas_movies(\n" +
            "    cinema_id INT NOT NULL,\n" +
            "    movie_id INT NOT NULL,\n" +
            "    FOREIGN KEY (cinema_id) REFERENCES cinemas(id),\n" +
            "    FOREIGN KEY (movie_id) REFERENCES movies(id)\n" +
            ");\n" +
            "\n" +
            "INSERT INTO cinemas_movies (cinema_id, movie_id) VALUES\n" +
            "                                                     (1, 1),\n" +
            "                                                     (1, 2),\n" +
            "                                                     (2, 3),\n" +
            "                                                     (2, 4),\n" +
            "                                                     (3, 5),\n" +
            "                                                     (3, 6),\n" +
            "                                                     (4, 7),\n" +
            "                                                     (5, 8),\n" +
            "                                                     (5, 9),\n" +
            "                                                     (6, 10),\n" +
            "                                                     (7, 11),\n" +
            "                                                     (8, 12),\n" +
            "                                                     (9, 1),\n" +
            "                                                     (10, 3),\n" +
            "                                                     (11, 5);";
}
