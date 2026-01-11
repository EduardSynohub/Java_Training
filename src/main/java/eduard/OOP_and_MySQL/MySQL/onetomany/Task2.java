package eduard.OOP_and_MySQL.MySQL.onetomany;

public class Task2 {
    public static final String QUERY = "USE products_ex;\n" +
            "CREATE TABLE categories(\n" +
            "    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
            "    name VARCHAR(100)\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE categories_sub(\n" +
            "    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
            "    main_id INT NOT NULL,\n" +
            "    name VARCHAR(100),\n" +
            "    FOREIGN KEY (main_id) REFERENCES categories(id)\n" +
            ");\n" +
            "\n" +
            "INSERT INTO categories (id, name) VALUES\n" +
            "                                      (1, 'Electronics'),\n" +
            "                                      (2, 'Clothing'),\n" +
            "                                      (3, 'Books'),\n" +
            "                                      (4, 'Home & Kitchen'),\n" +
            "                                      (5, 'Sports & Outdoors');\n" +
            "\n" +
            "INSERT INTO categories_sub (id, main_id, name) VALUES\n" +
            "                                                   (1, 1, 'Computers & Accessories'),\n" +
            "                                                   (2, 1, 'Mobile Phones'),\n" +
            "                                                   (3, 1, 'Audio & Headphones'),\n" +
            "                                                   (4, 2, 'Men\\'s Clothing'),\n" +
            "                                                   (5, 2, 'Women\\'s Clothing'),\n" +
            "                                                   (6, 2, 'Kids Clothing'),\n" +
            "                                                   (7, 3, 'Fiction'),\n" +
            "                                                   (8, 3, 'Non-Fiction'),\n" +
            "                                                   (9, 3, 'Comics & Graphic Novels'),\n" +
            "                                                   (10, 4, 'Kitchen Appliances'),\n" +
            "                                                   (11, 4, 'Furniture'),\n" +
            "                                                   (12, 4, 'Bedding & Linens'),\n" +
            "                                                   (13, 5, 'Fitness & Exercise'),\n" +
            "                                                   (14, 5, 'Outdoor Recreation'),\n" +
            "                                                   (15, 5, 'Team Sports');";
}
