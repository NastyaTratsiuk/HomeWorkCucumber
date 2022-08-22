package enums;

public enum ChooseTrip {

    ROUND_TRIP("Round trip"),
    ONE_WAY("One way");

    private final String chooseTripName;

    ChooseTrip(String chooseTripName) {
        this.chooseTripName = chooseTripName;
    }

    public String getChooseTripName() {
        return chooseTripName;
    }
}
