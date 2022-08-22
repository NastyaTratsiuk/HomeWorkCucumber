package enums;

public enum PhoneType {

    CELL("Cell"),
    HOME("Home"),
    BUSINESS("Business");

    private final String phoneTypeName;

    PhoneType(String phoneTypeName) {
        this.phoneTypeName = phoneTypeName;
    }

    public String getPhoneTypeName() {
        return phoneTypeName;
    }
}
