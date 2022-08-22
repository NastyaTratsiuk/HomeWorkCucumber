package enums;

public enum State {

    CALIFORNIA("California"),
    FLORIDA("Florida"),
    GEORGIA("Georgia"),
    NULL("Null");

    private final String stateName;

    State(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }
}
