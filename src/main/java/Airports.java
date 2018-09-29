public enum Airports {
    GLASGOW("Glasgow International Airport", "GLA", "Scotland"),
    VANCOUVER("Vancouver International Airport","YVR", "Canada"),
    MALAGA("Costa Del Sol", "AGP", "Spain"),
    LONDONH("London Heathrow", "LHR", "England"),
    LONDONG("London Gatwick", "LGW", "England"),
    AMSTERDAM("Schiphol", "AMS", "The Netherlands"),
    TENERIFE("Tenerife Airport", "TFN", "Spain"),
    TENERIFERS("Reina Sofia", "TFS", "Spain"),
    DUBAI("Dubai Airport", "DXB", "United Arab Emirates"),
    FRANKFURT("Frankfurt International", "FRA", "Germany"),
    PARIS("Charles De Gaulle Airport", "CDG", "France"),
    NEWYORK("John F Kennedy International Airport", "JFK", "United States of America"),
    TOKYO("Narita International Airport", "NRT", "Japan"),
    MOSCOW("Sheremetyevo International Airport", "SVO", "Russia"),
    HALIFAX("Stanfield International Airport", "YHZ", "Canada"),
    KEFLAVIK("Keflavik (Reykjavik) International Airport", "KEF", "Iceland"),
    SYDNEY("Sydney International/Kingsford Smith", "SYD", "Australia"),
    DURBAN("King Shaka International", "DUR", "South Africa"),
    GOTENBURG("Landvetter Airport", "GSE", "Sweden"),
    TORONTO("Lester B Pearson International Airport", "YYZ", "Canada");

    private final String name;
    private final String code;
    private final String country;

    Airports(String name, String code, String country){
        this.name = name;
        this.code = code;
        this.country = country;
    }

    public String getAirportCode(){
        return this.code;
    }

    public String getCountry(){
        return this.country;
    }
}
