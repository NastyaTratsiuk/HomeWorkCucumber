package enums;

public enum Year {

    ONE_NINE_NINE_FOUR("1994 г.");


    private final String yearNumber;

    Year(String yearNumber) {
        this.yearNumber = yearNumber;
    }

    public String getYearNumber() {
        return yearNumber;
    }
}
