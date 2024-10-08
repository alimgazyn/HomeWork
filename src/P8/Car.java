package P8;

public class Car extends Vehicle {
    int passengers;

    public Car(String carID, double carMileage, double fuelConsumption, double cost, int passengers) {
        super(carID, carMileage, fuelConsumption, cost);
        this.passengers = passengers;
    }
}
