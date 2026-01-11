package eduard.OOP_and_MySQL.MySQL.onetoone;

public class Task1 {
    public static final String QUERY = "use products_ex;\n" +
            "\n" +
            "CREATE TABLE client_address(\n" +
            "    client_id INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    city VARCHAR(100),\n" +
            "    street varchar(100),\n" +
            "    house_nr VARCHAR(10)\n" +
            ");\n" +
            "\n" +
            "ALTER TABLE clients\n" +
            "    ADD FOREIGN KEY (id)\n" +
            "        REFERENCES client_address(client_id)\n" +
            "            ON DELETE CASCADE;\n" +
            "\n" +
            "INSERT INTO client_address (client_id, city, street, house_nr) VALUES\n" +
            "    (1, 'Warsaw', 'Marszalkowska', '10A'),\n" +
            "    (2, 'Krakow', 'Dluga', '5'),#Task2\n" +
            "    (3, 'Gdansk', 'Grunwaldzka', '120'),\n" +
            "    (4, 'Wroclaw', 'Legnicka', '45B'),\n" +
            "    (5, 'Poznan', 'Polwiejska', '18'),\n" +
            "    (6, 'Lodz', 'Piotrkowska', '201'),\n" +
            "    (7, 'Szczecin', 'Wojska Polskiego', '33'),\n" +
            "    (8, 'Katowice', '3 Maja', '7'),\n" +
            "    (9, 'Lublin', 'Lipowa', '14C'),\n" +
            "    (10, 'Bydgoszcz', 'Gdanska', '88');\n" +
            "\n" +
            "INSERT INTO clients (id, name, surname) VALUES\n" +
            "    (1, 'John', 'Smith'),\n" +
            "    (2, 'Anna', 'Brown'),\n" +
            "    (3, 'Michael', 'Johnson'),\n" +
            "    (4, 'Emily', 'Davis'),\n" +
            "    (5, 'Daniel', 'Miller'),\n" +
            "    (6, 'Sophia', 'Wilson'),\n" +
            "    (7, 'James', 'Taylor'),\n" +
            "    (8, 'Olivia', 'Anderson'),\n" +
            "    (9, 'Robert', 'Thomas'),\n" +
            "    (10, 'Laura', 'Moore');";
}
