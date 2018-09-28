public enum Airports {
    GLASGOW("GLA", "Scotland"),
    TORONTO("YYZ", "Canada");

    private final String code;
    private final String country;

    Airports(String code, String country){
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
