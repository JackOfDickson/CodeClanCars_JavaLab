package entities;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private int till;
    private ArrayList<Vehicle> vehicleStock;

    public Dealership(int till, ArrayList<Vehicle> vehicleStock) {
        this.till = till;
        this.vehicleStock = vehicleStock;
    }
}
