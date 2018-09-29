import java.util.ArrayList;

public class Plane {
    private PlaneType planeType;
    private ArrayList<Passenger> passengerManifest;


    public Plane(PlaneType planeType){
        this.planeType = planeType;
        this.passengerManifest = new ArrayList<>();
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getCapacity(){
        return this.planeType.getCapacity();
    }

    public String getAirline() {
        return this.planeType.getAirline();
    }

    public int passengerCount() {
        return this.passengerManifest.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengerManifest.add(passenger);
    }

    public void emptyPlane() {
        this.passengerManifest.clear();
    }
}
