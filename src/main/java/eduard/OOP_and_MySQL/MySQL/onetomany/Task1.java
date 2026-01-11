package eduard.OOP_and_MySQL.MySQL.onetomany;

public class Task1 {
    public static final String QUERY = "use products_ex;\n" +
            "\n" +
            "CREATE TABLE opinions(\n" +
            "    opinion_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
            "    product_id INT NOT NULL,\n" +
            "    description VARCHAR(300),\n" +
            "    FOREIGN KEY (product_id) REFERENCES products(id)\n" +
            ");\n" +
            "\n" +
            "INSERT INTO products (name, description, price) VALUES\n" +
            "                                                    ( 'Wireless Mouse', 'Ergonomic wireless mouse with adjustable DPI.', 29.99 ),\n" +
            "                                                    ( 'Mechanical Keyboard', 'RGB backlit mechanical keyboard with blue switches.', 79.99 ),\n" +
            "                                                    ( 'USB-C Hub', '6-in-1 USB-C hub with HDMI, USB, and SD card slots.', 49.50 ),\n" +
            "                                                    ( 'Gaming Monitor', '27-inch 144Hz gaming monitor with FreeSync.', 299.99 ),\n" +
            "                                                    ( 'Bluetooth Headphones', 'Noise-cancelling over-ear Bluetooth headphones.', 129.99 ),\n" +
            "                                                    ( 'Portable SSD', '1TB portable SSD with USB 3.2 Gen 2.', 159.99 ),\n" +
            "                                                    ( 'Webcam HD', '1080p HD webcam with built-in microphone.', 59.99 ),\n" +
            "                                                    ( 'Smartwatch', 'Fitness smartwatch with heart rate monitor and GPS.', 199.99 );\n" +
            "\n" +
            "INSERT INTO opinions (product_id, description) VALUES\n" +
            "                                                   (1, 'Great quality, highly recommend!'),\n" +
            "                                                   (1, 'Arrived on time and works as expected.'),\n" +
            "                                                   (2, 'Not satisfied, the product broke after a week.'),\n" +
            "                                                   (3, 'Excellent value for money.'),\n" +
            "                                                   (3, 'Customer service was very helpful.'),\n" +
            "                                                   (4, 'Color was slightly different than pictured.'),\n" +
            "                                                   (5, 'Amazing product! Will buy again.'),\n" +
            "                                                   (5, 'Packaging could be better.'),\n" +
            "                                                   (6, 'Exceeded my expectations.'),\n" +
            "                                                   (7, 'Average quality, okay for the price.');";
}
