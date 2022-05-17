import org.junit.Before;
import org.junit.Test;
import vehicles.*;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine("VA-4750");
        tyre = new Tyre(TyreType.MEDIUM);
        car = new Car(engine, tyre, "Blue",12500, FuelType.DIESEL);
    }

    @Test
    public void canDamageCar(){
        car.damageVehicle();
        assertEquals(true, car.isDamaged());
        assertEquals(6250, car.getPrice());
    }

}
