import java.sql.*;

public class ATM {

    public boolean validateUser(String acc, String pin) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM users WHERE account_number = ? AND pin = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, acc);
            ps.setString(2, pin);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public double getBalance(String acc) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT balance FROM users WHERE account_number = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, acc);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getDouble("balance");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void deposit(String acc, double amount) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "UPDATE users SET balance = balance + ? WHERE account_number = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setDouble(1, amount);
            ps.setString(2, acc);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}