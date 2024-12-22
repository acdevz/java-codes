package JDBC.Flights;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {
    public List<String> getAvailableFlights(String source, String destination) {
        List<String> flights = new ArrayList<>();
        String query = "SELECT flight_number FROM flights WHERE source = ? AND destination = ? AND seats_available > 0";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, source);
            stmt.setString(2, destination);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                flights.add(rs.getString("flight_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flights;
    }

    public void updateSeats(String flightNumber, int seats) {
        String query = "UPDATE flights SET seats_available = seats_available - ? WHERE flight_number = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, seats);
            stmt.setString(2, flightNumber);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
