package JDBC.Flights;

import java.sql.*;

public class CustomerDAO {
    public int addCustomer(String name, String email) {
        String query = "INSERT INTO customers (name, email) VALUES (?, ?)";
        int customerId = -1;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                customerId = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerId;
    }
}
