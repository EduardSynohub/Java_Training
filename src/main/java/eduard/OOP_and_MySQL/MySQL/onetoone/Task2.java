package eduard.OOP_and_MySQL.MySQL.onetoone;

public class Task2 {
    public static final String QUERY = "USE cinemas_ex;\n" +
            "\n" +
            "ALTER TABLE payments\n" +
            "    ADD FOREIGN KEY (id)\n" +
            "        REFERENCES tickets(id)\n" +
            "            ON DELETE CASCADE;\n" +
            "\n" +
            "DELETE FROM payments;\n" +
            "\n" +
            "INSERT INTO payments (id, type, payment_date) VALUES\n" +
            "                                                  (1,  'cash',     '2024-01-10'),\n" +
            "                                                  (2,  'card',     '2024-01-11'),\n" +
            "                                                  (3,  'transfer', '2024-01-12'),\n" +
            "                                                  (4,  'cash',     '2024-01-13'),\n" +
            "                                                  (5,  'card',     '2024-01-14'),\n" +
            "                                                  (6,  'transfer', '2024-01-15'),\n" +
            "                                                  (7,  'cash',     '2024-01-16'),\n" +
            "                                                  (8,  'card',     '2024-01-17'),\n" +
            "                                                  (9,  'transfer', '2024-01-18'),\n" +
            "                                                  (10, 'cash',     '2024-01-19'),\n" +
            "                                                  (11, 'card',     '2024-01-20'),\n" +
            "                                                  (12, 'transfer', '2024-01-21');";
}
