package enums;

public enum Sort {

    RELEVANCE("Relevance"),
    NUMBER_OF_STOPS("Number of stops"),
    PRICE("Price (low to high)"),
    DEPARTURE_LATE_EARLY("Departure (late to early)"),
    DEPARTURE_EARLY_LATE("Departure (early to late)"),
    ARRIVAL_EARLY_LATE("Arrival (early to late)"),
    ARRIVAL_LATE_EARLY("Arrival (late to early)"),
    TOTAL_TRAVEL_TIME("Total travel time");

    private final String sortName;

    Sort(String sortName) {
        this.sortName = sortName;
    }

    public String getSortName() {
        return sortName;
    }
}
