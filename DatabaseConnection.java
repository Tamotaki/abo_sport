import java.sql.*;

public class DatabaseConnection {
    private static final String strClassName = "com.mysql.cj.jdbc.Driver";
    private static final String login = "root";
    private static final String motdepasse = "";
    private static final String strUrl = "jdbc:mysql://localhost:8888/salle_sport";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(strUrl, login, motdepasse);
}
    
}













