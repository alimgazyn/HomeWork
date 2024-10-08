package P8;

public class Minivan extends Vehicle{
    int baggage;

    public Minivan(String carID, double carMileage, double fuelConsumption, double cost, int baggage) {
        super(carID, carMileage, fuelConsumption, cost);
        this.baggage = baggage;
    }
}
