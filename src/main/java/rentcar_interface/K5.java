package rentcar_interface;

public class K5 implements CarInterface{

    private static final int DISTANCE_PER_LITER = 13;
    private static final String NAME = "K5";
    private final int tripDistance;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    public double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getChargeQuantity() {
        return CarInterface.super.getChargeQuantity();
    }
}