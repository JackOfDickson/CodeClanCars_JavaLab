package vehicles;

public class Hybrid extends Vehicle {

    private FuelType fuelType;
    private String batteryModel;

    public Hybrid(Engine engine, Tyre tyre, String colour, int price, FuelType fuelType, String batteryModel) {
        super(engine, tyre, colour, price);
        this.fuelType = fuelType;
        this.batteryModel = batteryModel;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public String getBatteryModel() {
        return batteryModel;
    }
}
