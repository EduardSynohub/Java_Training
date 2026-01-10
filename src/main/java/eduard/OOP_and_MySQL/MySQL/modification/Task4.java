package eduard.OOP_and_MySQL.MySQL.modification;

public class Task4 {
    public static final String QUERY_1 = "UPDATE cinemas SET address = 'National Stadium' WHERE name LIKE '%a';";
    public static final String QUERY_2 = "DELETE FROM payments WHERE DATEDIFF(CURDATE(), payment_date) > 4;\n" +
            "DELETE FROM payments WHERE payment_date < CURDATE() - INTERVAL 4 DAY;";
    public static final String QUERY_3 = "UPDATE movies SET rating = 5.4 WHERE CHAR_LENGTH(description) > 100;";
    public static final String QUERY_4 = "UPDATE tickets\n" +
            "    SET price = ROUND(price * 0.5, 2)\n" +
            "    WHERE quantity > 10;";
}
