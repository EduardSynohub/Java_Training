package eduard.OOP_and_MySQL.MySQL.change;

public class Task2 {
    public static final String QUERY = "ALTER TABLE movies ADD watchCount INT;\n" +
            "ALTER TABLE movies ADD isTop TINYINT DEFAULT 0;\n" +
            "ALTER TABLE movies ADD openTime TIME;\n" +
            "ALTER TABLE  movies ADD closeTime TIME;";
}
