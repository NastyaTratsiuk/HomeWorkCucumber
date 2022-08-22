package enums;

public enum CodePhone {

    UNITED_STATES("United States +1"),
    BELARUS("Belarus +375");

    private final String codePhoneName;

    CodePhone(String codePhoneName) {
        this.codePhoneName = codePhoneName;
    }

    public String getCodePhoneName() {
        return codePhoneName;
    }
}
