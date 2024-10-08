package P8;

public class Vehicle implements Serviceable{
    String carID;
    double carMileage;
    double fuelConsumption;
    double cost;

    public Vehicle(String carID, double carMileage, double fuelConsumption, double cost) {
        this.carID = carID;
        this.carMileage = carMileage;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
    }

    @Override
    public void scheduleMaintenance() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carID='" + carID + '\'' +
                ", carMileage=" + carMileage +
                ", fuelConsumption=" + fuelConsumption +
                ", cost=" + cost +
                '}';
    }
}
