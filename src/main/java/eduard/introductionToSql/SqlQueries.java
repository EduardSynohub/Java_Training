package eduard.introductionToSql;

public class SqlQueries {
    public static String QUERY1 = "INSERT INTO teachers (teachers_name, teachers_surname, salary) VALUE ('Jakub', 'Rogowski', 1800.00)";
    public static String QUERY2 = "SELECT * FROM teachers WHERE salary >= 2000";
    public static String QUERY3 = "SELECT * FROM teachers WHERE id BETWEEN 2 AND 5 ORDER BY id DESC";
    public static String QUERY4 = "SELECT * FROM teachers WHERE salary = 3000 OR salary = 1900";
    public static String QUERY5 = "SELECT * FROM teachers WHERE teachers_surname NOT LIKE '%ski'";
    public static String QUERY6 = "SELECT * FROM teachers WHERE teachers_name LIKE 'O%' AND salary >= 2000";
    public static String QUERY7 = "SELECT * FROM teachers WHERE char_length(teachers_name) <= 5";
    public static String QUERY8 = "SELECT UPPER(CONCAT(SUBSTRING(teachers_name, 1, 2), substring(teachers_surname, 1, 2))) AS initials FROM teachers ORDER BY teachers_surname DESC LIMIT 5";
    public static String QUERY9 = "UPDATE teachers\n" +
            "    SET teachers_name = 'Marek',\n" +
            "        teachers_surname = 'Jankowski',\n" +
            "        salary = 2300.00\n" +
            "WHERE id = 9";
    public static String QUERY10 = "UPDATE teachers\n" +
            "    SET salary = 1950\n" +
            "    WHERE salary <= 1900";

    public static String QUERY11 = "DELETE FROM teachers where id = 100";

}
