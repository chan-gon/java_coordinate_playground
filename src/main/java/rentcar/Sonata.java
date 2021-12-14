package rentcar;

public class Sonata extends Car{

    private static final String NAME = "Sonata";
    private final int driveDistance;

    public Sonata(int driveDistance) {
        this.driveDistance = driveDistance;
    }

    @Override
    double getDistancePerLiter() {
        return 10;
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
