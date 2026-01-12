package eduard.OOP_and_MySQL.MySQL.jointable;

public class Task2 {
    public static final String QUERY_1 = "SELECT * FROM orders AS o\n" +
            "    JOIN products_orders po\n" +
            "        ON o.id = po.order_id\n" +
            "    JOIN products p\n" +
            "        ON p.id = po.product_id\n" +
            "    WHERE p.id = 1;";
    public static final String QUERY_2 = "SELECT * FROM products\n" +
            "    JOIN products_orders po\n" +
            "        ON products.id = po.product_id\n" +
            "    JOIN orders o\n" +
            "        ON o.id = po.order_id\n" +
            "    WHERE o.id = 1;";
}
