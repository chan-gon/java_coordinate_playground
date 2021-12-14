package rentcar_interface;

public interface CarInterface {

    double getDistancePerLiter();

    double getTripDistance();

    String getName();

    default double getChargeQuantity()  {
        return getTripDistance() / getDistancePerLiter();
    }
}
