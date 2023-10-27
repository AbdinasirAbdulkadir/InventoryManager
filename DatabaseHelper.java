import java.sql.*;

public class DatabaseHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/inventory_system";
    private static final String USER = "root";  // use actual user
    private static final String PASS = "password";  // use actual password

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
