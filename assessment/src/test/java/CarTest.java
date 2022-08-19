import com.techelevator.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {


    Car car = new Car();

    @Before
    setUp() {

    }


    @Test
    public void when_given_car_object_returns_correct_age_in_years() {
        Car car = new Car(2018, "Toyota Camry", false);
        int actual = car.getAge();
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when_year_is_odd_and_between_4_and_25_years() {

    }
}



