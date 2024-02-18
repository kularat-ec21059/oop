public class Reservation {
    private Passenger passenger;
    private Flight flight;

    // Constructor
    public Reservation(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    // Getters
    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "passenger=" + passenger.getPassengerName() +
                ", flight=" + flight.getFlightNumber() +
                '}';
    }
}
