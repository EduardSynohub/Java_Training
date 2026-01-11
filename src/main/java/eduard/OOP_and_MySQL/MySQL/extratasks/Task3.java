package eduard.OOP_and_MySQL.MySQL.extratasks;

public class Task3 {
    public static final String QUERY = "INSERT INTO users_companies\n" +
            "(user_id, name, nip, street, street_nr, phone, post_code, capital, rate)\n" +
            "VALUES\n" +
            "    (1, 'AlphaTech', 1234567890, 'Main Street', 10, '123456789', '00-100', 50000.00, 0.1234),\n" +
            "    (2, 'BetaSoft', 2234567890, 'Oak Avenue', 25, '234567891', '01-200', 75000.50, 0.2567),\n" +
            "    (3, 'GammaCorp', 3234567890, 'Pine Road', 7, '345678912', '02-300', 120000.00, 0.3125),\n" +
            "    (4, 'DeltaGroup', 4234567890, 'Maple Street', 44, '456789123', '03-400', 98000.75, 0.1987),\n" +
            "    (5, 'Epsilon LLC', 1234117890, 'Sunset Blvd', 3, '567891234', '04-500', 150000.00, 0.4000);\n" +
            "\n" +
            "INSERT INTO images (offer_id, src, dimension)\n" +
            "VALUES\n" +
            "    (1, 'https://example.com/img1.jpg', '800x600'),\n" +
            "    (2, 'https://example.com/img2.jpg', '1024x768'),\n" +
            "    (3, 'https://example.com/img3.jpg', '640x480'),\n" +
            "    (4, 'https://example.com/img4.jpg', '1280x720'),\n" +
            "    (5, 'https://example.com/img5.jpg', '1920x1080');";
}
