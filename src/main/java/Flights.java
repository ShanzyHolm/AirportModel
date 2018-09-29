public enum Flights {
    GLASGOW("KL1472", "Glasgow", "Edinburgh"),
    VANCOUVER("AF8332", "Glasgow", "Vancouver"),
    MALAGA("FR2609", "Malaga", "Glasgow"),
    LONDONH("BA1487", "Glasgow", "London"),
    LONDONG("EZY811", "London", "Edinburgh"),
    AMSTERDAM("KL1476", "Amsterdam", "Glasgow"),
    TENERIFE("LS155", "Tenerife", "Glasgow"),
    TENERIFERS("FR6622", "Tenerife", "Edinburgh"),
    DUBAI("EK028", "Dubai", "Glasgow"),
    FRANKFURT("LH964", "Edinburgh", "Frankfurt"),
    PARIS("AF1886", "Paris", "Edinburgh"),
    NEWYORK("AA278", "New York", "Edinburgh"),
    TOKYO("JL407", "Tokyo", "Edinburgh"),
    MOSCOW("BA1493", "Glasgow", "Moscow"),
    HALIFAX("WS30", "Glasgow", "Halifax"),
    KEFLAVIK("FI431", "Reykjavik", "Glasgow"),
    SYDNEY("QR32", "Sydney", "Edinburgh"),
    DURBAN("BA1449", "Durban", "Edinburgh"),
    GOTENBURG("KL1478", "Glasgow", "Gothenburg"),
    TORONTO("TS525", "Glasgow", "Toronto");

    private final String flightNumber;
    private final String departureDestination;
    private final String arrivalDestination;

    Flights(String flightNumber, String departureDestination, String arrivalDestination){
        this.flightNumber = flightNumber;
        this.departureDestination = departureDestination;
        this.arrivalDestination = arrivalDestination;
        }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureDestination() {
        return departureDestination;
    }

    public String getArrivalDestination() {
        return arrivalDestination;
    }
}
