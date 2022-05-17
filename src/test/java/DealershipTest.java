import entities.Customer;
import entities.Dealership;
import org.junit.Before;
import org.junit.Test;
import vehicles.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Dealership dealership1;
    Customer customer;
    Customer customer1;
    Car car;
    Engine engine;
    Tyre tyre;


    @Before
    public void before() {
        engine = new Engine("VA-4750");
        tyre = new Tyre(TyreType.MEDIUM);
        car = new Car(engine, tyre, "Blue", 12500, FuelType.DIESEL);
        customer = new Customer(15000, new ArrayList<>());
        customer1 = new Customer(10000, new ArrayList<>());
        dealership = new Dealership(100000, new ArrayList<>());
        dealership1 = new Dealership(5000, new ArrayList<>());
    }

    @Test
    public void canBuyVehicle(){
        dealership.buyVehicle(car);
        assertEquals(1, dealership.getVehicleStock().size());
    }

    @Test
    public void cannotBuyVehicleIfNotEnoughMoney(){
        dealership1.buyVehicle(car);
        assertEquals(0, dealership.getVehicleStock().size());
    }

    @Test
    public void canSellVehicleToCustomer(){
        dealership.buyVehicle(car);
        dealership.sellVehicle(car, customer);
        assertEquals(0, dealership.getVehicleStock().size());
        assertEquals(1, customer.getOwnedVehicles().size());
    }

    @Test
    public void cannotSellVehicleToCustomerIfNotEnoughMoney(){
        dealership.buyVehicle(car);
        dealership.sellVehicle(car, customer1);
        assertEquals(1, dealership.getVehicleStock().size());
        assertEquals(0, customer1.getOwnedVehicles().size());
    }






}