
public class Main {
    public static void main(String[] args) {
        // Creating a Passenger
        Passenger passenger = new Passenger(1, "John Doe", "john@example.com");

        // Creating some Flights
        Flight flight1 = new Flight(101, "New York", "2024-02-07");
        Flight flight2 = new Flight(102, "London", "2024-02-08");

        // Booking flights
        passenger.bookFlight(flight1);
        passenger.bookFlight(flight2);

        // Viewing reservation details
        passenger.viewReservationDetails();

        // Cancelling a reservation
        //passenger.cancelReservation(passenger.reservations.get(0));

        // Viewing booking history
        passenger.bookingHistory();
    }
}