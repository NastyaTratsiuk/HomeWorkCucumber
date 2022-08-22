package enums;

public enum Address {

    HOME("Home"),
    BUSINESS("Business");

    private final String addressName;

    Address(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressName() {
        return addressName;
    }
}
