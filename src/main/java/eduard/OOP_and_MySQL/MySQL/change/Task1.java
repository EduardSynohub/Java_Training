package eduard.OOP_and_MySQL.MySQL.change;

public class Task1 {
    public static final String QUERY = "ALTER TABLE tickets ADD priceUSD DECIMAL(5,2);\n" +
            "ALTER TABLE movies ADD COLUMN director CHAR(80);\n" +
            "ALTER TABLE movies MODIFY COLUMN director CHAR(50);\n" +
            "ALTER TABLE tickets DROP COLUMN priceUSD;";
}
