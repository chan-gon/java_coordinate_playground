package rentcar_interface;

public class Sonata implements CarInterface{

    private static final int DISTANCE_PER_LITER = 10;
    private static final String NAME = "Sonata";
    private final int tripDistance;

    public Sonata(int tripDistance) {
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
