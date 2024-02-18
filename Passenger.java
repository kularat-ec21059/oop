import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private int passengerId;
    private String passengerName;
    private String passengerInfo;
    private List<Reservation> reservations;

    // Constructor
    public Passenger(int passengerId, String passengerName, String passengerInfo) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passengerInfo = passengerInfo;
        this.reservations = new ArrayList<>();
    }

    // Getters and Setters
    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerInfo() {
        return passengerInfo;
    }

    public void setPassengerInfo(String passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    // Functional Requirements
    // Book Flight
    public void bookFlight(Flight flight) {
        Reservation reservation = new Reservation(this, flight);
        reservations.add(reservation);
        System.out.println("Reservation for " + passengerName + " on flight " + flight.getFlightNumber() + " is confirmed.");
    }

    // Cancel Reservation
    public void cancelReservation(Reservation reservation) {
        reservations.remove(reservation);
        System.out.println("Reservation for " + passengerName + " has been canceled.");
    }

    // View Reservation Details
    public void viewReservationDetails() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found for " + passengerName);
        } else {
            System.out.println("Reservations for " + passengerName + ":");
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }

    // Booking history
    public void bookingHistory() {
        if (reservations.isEmpty()) {
            System.out.println("No booking history found for " + passengerName);
        } else {
            System.out.println("Booking history for " + passengerName + ":");
            for (Reservation reservation : reservations) {
                System.out.println(reservation.getFlight().getFlightNumber() + " - " + reservation.getFlight().getDestination() + " - " + reservation.getFlight().getDate());
            }
        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", passengerName='" + passengerName + '\'' +
                ", passengerInfo='" + passengerInfo + '\'' +
                '}';
    }
}
