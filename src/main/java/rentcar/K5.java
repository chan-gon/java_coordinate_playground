package rentcar;

public class K5 extends Car{

    private final int driveDistance;
    private final String name = "K5";

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
        return this.name;
    }

    @Override
    public String toString() {
        return getName() + " : " + (int)getChargeQuantity() + "리터\n";
    }
}
