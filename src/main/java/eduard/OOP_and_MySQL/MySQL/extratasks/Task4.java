package eduard.OOP_and_MySQL.MySQL.extratasks;

public class Task4 {
    public static final String QUERY_1 = "UPDATE offers\n" +
            "    SET price = price + 1000\n" +
            "        WHERE owner BETWEEN 20 AND 25";
    public static final String QUERY_2 = "DELETE FROM offers\n" +
            "    where expire < CURDATE() + INTERVAL 3 DAY";
    public static final String QUERY_3 = "DELETE FROM offers\n" +
            "    WHERE phone LIKE '+48%'\n" +
            "    AND expire > CURDATE()\n" +
            "    AND promoted = 1";
    public static final String QUERY_4 = "UPDATE offers\n" +
            "    SET promoted = 1, promoted_to = CURDATE() + INTERVAL 23 DAY\n" +
            "        WHERE phone REGEXP '^..48'\n" +
            "        AND promoted = 0";
    public static final String QUERY_5 = "UPDATE offers\n" +
            "    SET description = REPLACE(description, 'executed', 'found')\n" +
            "        WHERE price > 400000\n" +
            "        AND (phone LIKE '%(%' OR phone LIKE '%)%')";
}
