package eduard.OOP_and_MySQL.MySQL.extratasks;

public class FootballTasks {
    public static final String QUERY_1 = "SELECT * FROM Teams\n" +
            "         ORDER BY points DESC\n" +
            "         LIMIT 1";
    public static final String QUERY_2 = "SELECT * FROM Teams\n" +
            "    ORDER BY points DESC";
    public static final String QUERY_3 = "SELECT t.name, g.team_home_goals, t2.name, g.team_away_goals FROM Games g\n" +
            "         JOIN football.Teams t on t.id = g.team_home\n" +
            "         JOIN football.Teams t2 on t2.id = g.team_away\n" +
            "    WHERE team_home = 4";
    public static final String QUERY_4 = "SELECT t2.name, g.team_home_goals, t.name, g.team_away_goals FROM Games g\n" +
            "    JOIN football.Teams t ON t.id = g.team_away\n" +
            "    JOIN football.Teams t2 ON t2.id = g.team_home\n" +
            "    WHERE team_away = 4";
    public static final String QUERY_5 = "SELECT t.name, g.team_home_goals, t2.name, g.team_away_goals FROM Games g\n" +
            "    JOIN football.Teams t ON t.id = g.team_home\n" +
            "    JOIN football.Teams t2 ON t2.id = g.team_away\n" +
            "    WHERE team_home = 4 OR team_away = 4";
    public static final String QUERY_6_1 = "SELECT SUM(team_home_goals) FROM Games\n" +
            "    WHERE team_home = 4";
    public static final String QUERY_6_2 = "SELECT SUM(team_away_goals) FROM Games\n" +
            "    WHERE team_away = 4";
}
