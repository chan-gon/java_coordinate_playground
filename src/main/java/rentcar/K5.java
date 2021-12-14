package rentcar;

public class K5 extends Car{

    private static final String NAME = "K5";
    private final int driveDistance;

    public K5(int driveDistance) {
        this.driveDistance = driveDistance;
    }

    @Override
    double getDistancePerLiter() {
        return 13;
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
