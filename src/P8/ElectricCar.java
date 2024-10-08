package P8;

public class ElectricCar extends Vehicle{
    double battery;

    public ElectricCar(String carID, double carMileage, double fuelConsumption, double cost, double battery) {
        super(carID, carMileage, fuelConsumption, cost);
        this.battery = battery;
    }
}
