package rentcar;

public class Avante extends Car{

    private static final int DISTANCE_PER_LITER = 15;
    private static final String NAME = "Avante";
    private final int tripDistance;
    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return NAME;
    }
}
