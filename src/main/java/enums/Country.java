package enums;

public enum Country {

    UNITED_STATES("United States"),
    BELARUS("Belarus");

    private final String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
