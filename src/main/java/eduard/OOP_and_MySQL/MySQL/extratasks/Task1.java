package eduard.OOP_and_MySQL.MySQL.extratasks;

public class Task1 {
    public static final String QUERY_1 = "SELECT * FROM users\n" +
            "         WHERE name LIKE 'Julia %';";
    public static final String QUERY_2 = "SELECT * FROM users\n" +
            "    ORDER BY email DESC\n" +
            "        LIMIT 5;";
    public static final String QUERY_3 = "SELECT * FROM users\n" +
            "    WHERE email LIKE '%@yahoo.com'\n" +
            "    AND name LIKE 'L%';";
    public static final String QUERY_4 = "SELECT * FROM users\n" +
            "    WHERE SHA2(CONCAT(name, salt), 256) = password;";
    public static final String QUERY_5 = "SELECT offers.id, offers.title FROM offers\n" +
            "    WHERE price > 500000;";
    public static final String QUERY_6 = "SELECT id, price FROM offers\n" +
            "    WHERE activation_token = ''\n" +
            "        AND price BETWEEN 2000 AND 400000;";
    public static final String QUERY_7 = "SELECT title, price, phone FROM offers\n" +
            "    WHERE expire <= CURDATE() + INTERVAL 10 DAY\n" +
            "        AND status = 1\n" +
            "        AND expire > CURDATE();";
    public static final String QUERY_8 = "SELECT * FROM offers\n" +
            "    WHERE description LIKE '%violent%'\n" +
            "        AND phone LIKE '%2%'\n" +
            "            AND price > 50000;";
    public static final String QUERY_9 = "SELECT * FROM offers\n" +
            "    WHERE promoted = 0\n" +
            "        AND price < 300000\n" +
            "            AND title LIKE '%PLC';";
    public static final String QUERY_10 = "SELECT * FROM offers\n" +
            "    WHERE price * 2 < 50000\n" +
            "        AND promoted_to > NOW();";
    public static final String QUERY_11 = "SELECT COUNT(*) AS sum_active FROM offers\n" +
            "    WHERE CURDATE() < expire\n" +
            "        AND status = 1;";
    public static final String QUERY_12 = "SELECT owner, COUNT(owner) AS sum_user FROM offers\n" +
            "    WHERE expire > CURDATE()\n" +
            "        AND status = 1\n" +
            "            GROUP BY owner;";
    public static final String QUERY_13 = "SELECT status AS type, COUNT(status) AS counter FROM offers\n" +
            "    WHERE status = 1 OR status = 2\n" +
            "        GROUP BY type;";
    public static final String QUERY_14 = "SELECT SUM(price) AS sum_nonactive_nopromoted FROM offers\n" +
            "    WHERE expire < CURDATE()\n" +
            "        AND status = 1\n" +
            "        AND promoted = 0;";
    public static final String QUERY_15 = "SELECT ROUND(AVG(price), 2) AS avg_price FROM offers\n" +
            "    WHERE expire > CURDATE()\n" +
            "        AND promoted = 1\n" +
            "        AND price > 44645.04;";
}
