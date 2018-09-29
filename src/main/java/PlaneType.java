public enum PlaneType {
    F104STARFIGHTER("Royal Canadian Air Force", 1),
    AIRBUS330("Air Transat", 345),
    BOEING737T("Air Transat", 189),
    BOEING747400("KLM", 408),
    BOEING777("KLM", 318),
    AIRBUSA380("Emirates", 615),
    BOEING757("Icelandair", 183),
    BOEING737W("Westjet", 113),
    BOEING767("Japan Airlines", 237),
    RJ85AVROLINER("Air France", 95),
    AIRBUSA320("easyJet", 180),
    AIRBUSA321("Thomas Cook", 220),
    BOEING757V2("Highland Air", 172),
    ;

    private final String airline;
    private final int capacity;

    PlaneType(String airline, int capacity){
        this.airline = airline;
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getAirline() {
        return airline;
    }
}
