package eduard.OOP_and_MySQL.MySQL.jointable;

public class Task3 {
    public static final String QUERY_1 = "SELECT * FROM products p\n" +
            "    JOIN opinions o ON p.id = o.product_id\n" +
            "    WHERE o.description IS NOT NULL;";
    public static final String QUERY_2 = "SELECT * FROM products p\n" +
            "    LEFT JOIN opinions o ON p.id = o.product_id;";
    public static final String QUERY_3 = "SELECT * FROM opinions o\n" +
            "    JOIN products p ON p.id = o.product_id\n" +
            "    WHERE p.id = 1;";
}
