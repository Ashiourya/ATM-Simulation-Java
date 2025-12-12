import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/atm_db";
    private static final String username = "root";  // your MySQL username
    private static final String password = "";      // your MySQL password

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

