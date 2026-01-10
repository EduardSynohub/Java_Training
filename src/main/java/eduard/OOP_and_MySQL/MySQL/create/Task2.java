package eduard.OOP_and_MySQL.MySQL.create;

public class Task2 {
    public static final String QUERY = "use products_ex;\n" +
            "CREATE TABLE products(\n" +
            "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    name VARCHAR(100),\n" +
            "    description VARCHAR(1000),\n" +
            "    price DECIMAL(10,2)\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE orders(\n" +
            "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    description VARCHAR(1000)\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE clients(\n" +
            "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    name VARCHAR(100),\n" +
            "    surname VARCHAR(100)\n" +
            ");";
}
