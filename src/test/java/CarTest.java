import org.junit.Before;
import org.junit.Test;
import vehicles.*;

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

}
