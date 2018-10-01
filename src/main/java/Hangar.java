import java.util.ArrayList;

public class Hangar {
    private String hangerName;
    private int planeCapacity;
    private ArrayList<Plane> planes;

    public Hangar(String hangerName, int planeCapacity){
        this.hangerName = hangerName;
        this.planeCapacity = planeCapacity;
        this.planes = new ArrayList<>();
    }

    public String getHangerName() {
        return hangerName;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    public int getPlaneCount() {
        return this.planes.size();
    }

    public boolean hangarIsFull(){
        return this.getPlaneCount() == this.getPlaneCapacity();
    }

    public void addPlane(Plane plane) {
        if (!hangarIsFull()){
            this.planes.add(plane);
        }
    }

    public Plane getPlane(Plane planeType){
        Plane planeFound = null;
        for (Plane plane : this.planes) {
            if (plane.getPlaneType().equals(planeType)){
                planeFound = this.planes.remove(this.planes.indexOf(plane));
                break;
            }
        }
        return planeFound;
    }

}
