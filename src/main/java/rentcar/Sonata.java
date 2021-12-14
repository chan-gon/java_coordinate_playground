package rentcar;

public class Sonata extends Car{

    private final int driveDistance;
    private final String name = "Sonata";

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
        return this.name;
    }

    @Override
    public String toString() {
        return getName() + " : " + (int)getChargeQuantity() + "리터\n";
    }
}
