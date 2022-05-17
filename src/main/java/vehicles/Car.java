package vehicles;

public class Car extends Vehicle{

    private FuelType fuelType;

    public Car(Engine engine, Tyre tyre, String colour, int price, FuelType fuelType) {
        super(engine, tyre, colour, price);
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
