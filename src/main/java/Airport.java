import java.util.ArrayList;

public class Airport {
    private Airports airports;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;


    public Airport(Airports airports){
        this.airports = airports;
        hangars = new ArrayList<>();
    }

    public String getAirportName() {
        return this.airports.getName();
    }

    public String getAirportCode() {
        return this.airports.getAirportCode();
    }

    public String getCountryOfOrigin() {
        return this.airports.getCountryOfOrigin();
    }

    public void addHangar(Hangar hangar){
        this.hangars.add(hangar);
    }

    public int planeCount() {
        return this.hangars.size();
    }
}
