import org.junit.Before;
import org.junit.Test;

public class FlightTest {
    Flight flight;
    Plane plane;
    Plane plane1;

    @Before
    public void before() {
        flight = new Flight(plane, "YYZ", 623);
        plane = new Plane(PlaneType.BOEING747);
        plane1 = new Plane(PlaneType.AIRBUS330);

    }

    @Test
    public void canGetFlightNumber() {
    }
}
