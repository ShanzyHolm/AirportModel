public enum Flights {
    GLASGOW("KL1472", Airports.GLASGOW, Airports.EDINBURGH),
    VANCOUVER("AF8332", Airports.GLASGOW, Airports.VANCOUVER),
    MALAGA("FR2609", Airports.MALAGA, Airports.GLASGOW),
    LONDONH("BA1487", Airports.GLASGOW, Airports.LONDONH),
    LONDONG("EZY811", Airports.LONDONG, Airports.EDINBURGH),
    AMSTERDAM("KL1476", Airports.AMSTERDAM, Airports.GLASGOW),
    TENERIFE("LS155", Airports.TENERIFE, Airports.GLASGOW),
    TENERIFERS("FR6622", Airports.TENERIFERS, Airports.EDINBURGH),
    DUBAI("EK028", Airports.DUBAI, Airports.GLASGOW),
    FRANKFURT("LH964", Airports.EDINBURGH, Airports.FRANKFURT),
    PARIS("AF1886", Airports.PARIS, Airports.EDINBURGH),
    NEWYORK("AA278", Airports.NEWYORK, Airports.EDINBURGH),
    TOKYO("JL407", Airports.TOKYO, Airports.EDINBURGH),
    MOSCOW("BA1493", Airports.GLASGOW, Airports.MOSCOW),
    HALIFAX("WS30", Airports.GLASGOW, Airports.HALIFAX),
    KEFLAVIK("FI431", Airports.KEFLAVIK, Airports.EDINBURGH),
    SYDNEY("QR32", Airports.SYDNEY, Airports.GLASGOW),
    DURBAN("BA1449", Airports.DURBAN, Airports.GLASGOW),
    GOTENBURG("KL1478", Airports.EDINBURGH, Airports.GOTENBURG),
    TORONTO("TS525", Airports.GLASGOW, Airports.TORONTO);

    private final String flightNumber;
    private final Enum departureDestination;
    private final Enum arrivalDestination;

    Flights(String flightNumber, Enum departureDestination, Enum arrivalDestination){
        this.flightNumber = flightNumber;
        this.departureDestination = departureDestination;
        this.arrivalDestination = arrivalDestination;
        }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Enum getDepartureDestination() {
        return departureDestination;
    }

    public Enum getArrivalDestination() {
        return arrivalDestination;
    }
}
