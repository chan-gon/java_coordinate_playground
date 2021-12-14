package rentcar;

public class Avante extends Car {

    private final int driveDistance;
    private final String name = "Avante";

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
        return this.name;
    }

    @Override
    public String toString() {
        return getName() + " : " + (int)getChargeQuantity() + "리터\n";
    }
}
