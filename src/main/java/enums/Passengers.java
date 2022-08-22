package enums;

public enum Passengers {

    ONE ("1"),
    TWO ("2"),
    THREE ("3"),
    FOUR ("4"),
    FIVE ("5");

    private final String passengers;

    public String getPassengers() {
        return passengers;
    }

    Passengers(String passengers) {
        this.passengers = passengers;
    }
}
