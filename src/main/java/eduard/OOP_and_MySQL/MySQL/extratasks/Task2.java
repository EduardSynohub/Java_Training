package eduard.OOP_and_MySQL.MySQL.extratasks;

public class Task2 {
    public static final String QUERY = "USE extraDB;\n" +
            "CREATE TABLE images(\n" +
            "    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
            "    offer_id INT UNSIGNED NOT NULL,\n" +
            "    src VARCHAR(100),\n" +
            "    dimension VARCHAR(10),\n" +
            "    CONSTRAINT images_offer_fk\n" +
            "    FOREIGN KEY (offer_id) REFERENCES offers(id)\n" +
            "                   ON DELETE CASCADE\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE users_companies(\n" +
            "    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
            "    user_id INT UNSIGNED UNIQUE,\n" +
            "    name VARCHAR(30),\n" +
            "    nip INT,\n" +
            "    street VARCHAR(50),\n" +
            "    street_nr MEDIUMINT,\n" +
            "    phone CHAR(9),\n" +
            "    post_code CHAR(6),\n" +
            "    capital DECIMAL(7, 2),\n" +
            "    rate DECIMAL(5, 4),\n" +
            "    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
            "    FOREIGN KEY (user_id) REFERENCES users(id),\n" +
            "    CONSTRAINT users_companies_user_fk\n" +
            "                            FOREIGN KEY (user_id) REFERENCES users(id)\n" +
            "                            ON DELETE CASCADE\n" +
            ");";
}
