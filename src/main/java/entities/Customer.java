package entities;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private int money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(int money, ArrayList<Vehicle> ownedVehicles) {
        this.money = money;
        this.ownedVehicles = ownedVehicles;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

}
