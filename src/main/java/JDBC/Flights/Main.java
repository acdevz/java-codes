package JDBC.Flights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightDAO flightDAO = new FlightDAO();
        CustomerDAO customerDAO = new CustomerDAO();
        ReservationDAO reservationDAO = new ReservationDAO();

        System.out.println("Welcome to the Airline Reservation System");

        System.out.print("Enter source: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        System.out.println("Available Flights:");
        flightDAO.getAvailableFlights(source, destination).forEach(System.out::println);

        System.out.print("Enter flight number to book: ");
        String flightNumber = scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        int customerId = customerDAO.addCustomer(name, email);
        int flightId = flightDAO.getAvailableFlights(source, destination)
                .indexOf(flightNumber) + 1; // Simplified mapping

        reservationDAO.createReservation(customerId, flightId);
        flightDAO.updateSeats(flightNumber, 1);

        System.out.println("Reservation Successful!");
    }
}

