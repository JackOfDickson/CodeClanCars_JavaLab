package vehicles;

public class ElectricCar extends Vehicle{
    private String batteryModel;

    public ElectricCar(Engine engine, Tyre tyre, String colour, int price, String batteryModel) {
        super(engine, tyre, colour, price);
        this.batteryModel = batteryModel;
    }

    public String getBatteryModel() {
        return batteryModel;
    }
}
