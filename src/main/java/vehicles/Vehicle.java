package vehicles;

public abstract class Vehicle {

    private Engine engine;
    private Tyre tyre;
    private String colour;
    private int price;
    private boolean isDamaged;

    public Vehicle(Engine engine, Tyre tyre, String colour, int price) {
        this.engine = engine;
        this.tyre = tyre;
        this.colour = colour;
        this.price = price;
        this.isDamaged = false;
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

    public boolean isDamaged() {
        return isDamaged;
    }

    public void damageVehicle(){
        if (isDamaged == false){
            isDamaged = true;
            price = price/2;
        }
    }

}
