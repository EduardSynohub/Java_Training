package eduard.OOP_and_MySQL.MySQL.manytomany;

public class Task1 {
    public static final String QUERY = "USE products_ex;\n" +
            "\n" +
            "INSERT INTO orders (id, description) VALUES\n" +
            "                                         (1, 'Order for John Doe'),\n" +
            "                                         (2, 'Order for Jane Smith'),\n" +
            "                                         (3, 'Bulk order for office supplies'),\n" +
            "                                         (4, 'Gift package for client'),\n" +
            "                                         (5, 'Express delivery order');\n" +
            "\n" +
            "CREATE TABLE products_orders(\n" +
            "    order_id INT NOT NULL,\n" +
            "    product_id INT NOT NULL,\n" +
            "    quantity INT DEFAULT 1,\n" +
            "    PRIMARY KEY (product_id, order_id),\n" +
            "    FOREIGN KEY (product_id) REFERENCES products(id),\n" +
            "    FOREIGN KEY (order_id) REFERENCES orders(id)\n" +
            ");\n" +
            "\n" +
            "INSERT INTO products_orders (order_id, product_id, quantity) VALUES\n" +
            "                                                                 (1, 1, 2),\n" +
            "                                                                 (1, 3, 1), \n" +
            "                                                                 (2, 2, 1),\n" +
            "                                                                 (2, 5, 1),\n" +
            "                                                                 (3, 4, 3),\n" +
            "                                                                 (3, 6, 5),\n" +
            "                                                                 (4, 7, 1),\n" +
            "                                                                 (4, 8, 1),\n" +
            "                                                                 (5, 1, 1),\n" +
            "                                                                 (5, 2, 1),\n" +
            "                                                                 (5, 5, 2);";
}
