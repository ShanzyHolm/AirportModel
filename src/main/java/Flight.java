public class Flight {
    private PlaneType planeType;
    private Flights flights;


    public Flight(PlaneType planeType, Flights flights){
        this.planeType = planeType;
        this.flights = flights;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public Flights getFlight() {
        return flights;
    }

    public String getFlightNumber() {
        return this.flights.getFlightNumber();
    }

    public Enum getDepartureDestination() {
        return this.flights.getDepartureDestination();
    }

    public Enum getArrivalDestination() {
        return this.flights.getArrivalDestination();
    }

}
