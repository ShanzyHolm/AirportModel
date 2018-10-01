import java.util.ArrayList;

public class Airport {
    private Airports airports;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flightSchedule;


    public Airport(Airports airports){
        this.airports = airports;
        this.hangars = new ArrayList<>();
        this.flightSchedule = new ArrayList<>();
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

    public int hangarCount() {
        return this.hangars.size();
    }

    public int flightCount() {
        return this.flightSchedule.size();
    }

    public void addFlight(Flight flight) {
        this.flightSchedule.add(flight);
    }

//    public void assignPlaneFromHangarToFlight(ArrayList<Hangar> hangarsList, Flight flight) {
//        for (Flight flightLog : this.flightSchedule){
//            if (flightLog.getFlight() == flight) {
//                for
//            }
//        }
//    }
}
