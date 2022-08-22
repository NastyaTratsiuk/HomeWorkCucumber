package enums;

public enum Language {

    ENGLISH("English"),
    ESPANOL("Espanol");

    private final String languageName;

    Language(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageName() {
        return languageName;
    }
}
