import java.util.ArrayList;

public class Airport {
    private Airports airports;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;


    public Airport(Airports airports){
        this.airports = airports;
    }

    public String getAirportName() {
        return this.airports.getName();
    }

    public String getAirportCode() {
        return this.airports.getAirportCode();
    }
}
