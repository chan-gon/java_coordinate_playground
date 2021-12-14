package rentcar;

public class Avante extends Car {
    private static final String NAME = "Avante";
    private final int driveDistance;

    public Avante(int driveDistance) {
        this.driveDistance = driveDistance;
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return this.driveDistance;
    }

    @Override
    String getName() {
        return NAME;
    }

}
