package enums;

public enum Airport {

    LAS_VEGAS("LAS"),
    ATLANTA("ATL");

    private final String airportName;

    Airport(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportName() {
        return airportName;
    }
}
