public enum PlaneType {
    F104STARFIGHTER("F 104 Starfighter", "Royal Canadian Air Force", 1),
    AIRBUS330("Airbus 330", "Air Transat", 345),
    BOEING737T("Boeing 737", "Air Transat", 189),
    BOEING747400("Boeing 747-400", "KLM", 408),
    BOEING777("Boeing 777", "KLM", 318),
    AIRBUSA380("Airbus A 380", "Emirates", 615),
    BOEING757("Boeing 757", "Icelandair", 183),
    BOEING737W("Boeing 737", "Westjet", 113),
    BOEING767("Boeing 767", "Japan Airlines", 237),
    RJ85AVROLINER("RJ 85 AvroLiner", "Air France", 95),
    AIRBUSA320("Airbus A 320", "easyJet", 180),
    AIRBUSA321("Airbus A 321", "Thomas Cook", 220),
    BOEING757V2("Boeing 757 V2", "Highland Air", 172),
    ;

    private final String planeType;
    private final String airline;
    private final int capacity;

    PlaneType(String planeType, String airline, int capacity){
        this.planeType = planeType;
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
