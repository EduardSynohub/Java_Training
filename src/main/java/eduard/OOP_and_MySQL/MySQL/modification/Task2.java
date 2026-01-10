package eduard.OOP_and_MySQL.MySQL.modification;

public class Task2 {
    public static final String QUERY_1 = "SELECT COUNT(*) FROM tickets;";
    public static final String QUERY_2 = "SELECT type, COUNT(*) FROM payments GROUP BY type;";
    public static final String QUERY_3 = "SELECT AVG(price) FROM tickets;";
    public static final String QUERY_4 = "SELECT type, payment_date FROM payments LIMIT 5 OFFSET 1;";
    public static final String QUERY_5 = "SELECT type, COUNT(*) AS count_pay FROM payments GROUP BY type HAVING count_pay > 1;";
    public static final String QUERY_6 = "SELECT sum(quantity) FROM tickets WHERE price > 23.15;";
}
