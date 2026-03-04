import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {
    private static final String URL = "jdbc:mysql://localhost:8889/salle_sport";
    private static final String USER = "test";
    private static final String PASSWORD = "test";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
