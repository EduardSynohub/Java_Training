package eduard.OOP_and_MySQL.MySQL.jointable;

public class Task4 {
    public static final String QUERY_1 = "SELECT * FROM categories_sub cs\n" +
            "    JOIN categories c ON cs.main_id = c.id\n" +
            "    WHERE c.id = 1;";
    public static final String QUERY_2 = "SELECT DISTINCT c.id, c.name FROM categories c\n" +
            "    JOIN categories_sub cs\n" +
            "        ON c.id = cs.main_id;";
}
