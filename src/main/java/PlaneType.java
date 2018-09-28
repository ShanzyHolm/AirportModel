public enum PlaneType {
    AIRBUS330(1),
    BOEING747(2);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}
