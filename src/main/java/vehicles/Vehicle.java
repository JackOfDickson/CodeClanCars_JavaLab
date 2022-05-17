package vehicles;

public abstract class Vehicle {

    private Engine engine;
    private Tyre tyre;
    private String colour;
    private int price;

    public Vehicle(Engine engine, Tyre tyre, String colour, int price) {
        this.engine = engine;
        this.tyre = tyre;
        this.colour = colour;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }
}
