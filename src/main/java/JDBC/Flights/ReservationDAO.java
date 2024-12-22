package JDBC.Flights;

import java.sql.*;

public class ReservationDAO {
    public void createReservation(int customerId, int flightId) {
        String query = "INSERT INTO reservations (flight_id, customer_id, reservation_date) VALUES (?, ?, NOW())";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, flightId);
            stmt.setInt(2, customerId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
