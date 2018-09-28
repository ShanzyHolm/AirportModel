import java.util.ArrayList;

public class Airport {
    private String airportName;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;
    private String airportCode;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.airportName = airportName;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getAirportCode() {
        return airportCode;
    }
}
