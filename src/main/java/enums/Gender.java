package enums;

public enum Gender {

    M("Male"),
    F("Female"),
    X("Unspecified"),
    U("Undisclosed");

    private final String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return genderName;
    }
}
