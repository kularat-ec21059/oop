public class Flight {
    private int flightNumber;
    private String destination;
    private String date;

    // Constructor
    public Flight(int flightNumber, String destination, String date) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.date = date;
    }

    // Getters
    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }
}
