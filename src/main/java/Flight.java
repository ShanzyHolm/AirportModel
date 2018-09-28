public class Flight {
    private Plane plane;
    private String airportDestination;
    private int flightNumber;

    public Flight(Plane plane, String airportDestination, int flightNumber) {
        this.plane = plane;
        this.airportDestination = airportDestination;
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
}
