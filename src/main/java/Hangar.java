public class Hangar {
    private String hangerName;
    private int planeCapacity;

    public Hangar(String hangerName, int planeCapacity){
        this.hangerName = hangerName;
        this.planeCapacity = planeCapacity;
    }

    public String getHangerName() {
        return hangerName;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }
}
