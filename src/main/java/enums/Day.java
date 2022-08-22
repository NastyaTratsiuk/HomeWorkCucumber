package enums;

public enum Day {

    ONE("1"),
    TWO("2"),
    THREE("3"),
    TWENTY_EIGHT("28");

    private final String dayNumberName;

    Day(String dayNumberName) {
        this.dayNumberName = dayNumberName;
    }

    public String getDayNumberName() {
        return dayNumberName;
    }
}
