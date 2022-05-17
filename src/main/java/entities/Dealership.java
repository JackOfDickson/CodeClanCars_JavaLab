package entities;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private int till;
    private ArrayList<Vehicle> vehicleStock;

    public Dealership(int till, ArrayList<Vehicle> vehicleStock) {
        this.till = till;
        this.vehicleStock = vehicleStock;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Vehicle> getVehicleStock() {
        return vehicleStock;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (till >= vehicle.getPrice()){
            vehicleStock.add(vehicle);
            till -= vehicle.getPrice();
        }
    }

    public void sellVehicle(Vehicle vehicle, Customer customer) {
        if (customer.getMoney() >= vehicle.getPrice()){
            customer.buyVehicle(vehicle);
            vehicleStock.remove(vehicle);
            till += vehicle.getPrice();
        }
    }

    public void repair(Vehicle vehicle) {
        if (vehicle.isDamaged() == true){
            vehicle.setDamaged(false);
            till -= vehicle.getPrice();
            vehicle.setPrice(vehicle.getPrice()*2);
        }
    }


}
