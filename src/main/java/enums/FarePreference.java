package enums;

public enum FarePreference {

    COACH("Coach"),
    BUSINESS("Business"),
    FIRST("First");

    private final String farePreferenceName;

    FarePreference(String farePreferenceName) {
        this.farePreferenceName = farePreferenceName;
    }

    public String getFarePreferenceName() {
        return farePreferenceName;
    }
}
