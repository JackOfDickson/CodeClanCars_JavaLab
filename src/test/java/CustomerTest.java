import entities.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicles.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Customer customer1;
    Car car;
    Engine engine;
    Tyre tyre;


    @Before
    public void before(){
        engine = new Engine("VA-4750");
        tyre = new Tyre(TyreType.MEDIUM);
        car = new Car(engine, tyre, "Blue",12500, FuelType.DIESEL);
        customer = new Customer(15000, new ArrayList<>());
        customer1 = new Customer(10000, new ArrayList<>());
    }

    @Test
    public void canBuyCardIfEnoughMoney(){
        customer.buyVehicle(car);
        assertEquals(1, customer.getOwnedVehicles().size());
    }

    @Test
    public void cannotBuyCardIfNotEnoughMoney(){
        customer1.buyVehicle(car);
        assertEquals(0, customer.getOwnedVehicles().size());
    }

}
