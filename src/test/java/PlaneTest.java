import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Passenger passenger1;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUS330);
        plane1 = new Plane(PlaneType.AIRBUSA380);
        plane2 = new Plane(PlaneType.BOEING747400);
        plane3 = new Plane(PlaneType.F104STARFIGHTER);
        passenger1 = new Passenger("David Irons");
    }

    @Test
    public void canGetTypeOfPlane() {
        assertEquals(PlaneType.AIRBUS330, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(615, plane1.getCapacity());
    }

    @Test
    public void canGetAirline() {
        assertEquals("KLM", plane2.getAirline());
    }

    @Test
    public void planeStartsEmpty() {
        assertEquals(0, plane.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        plane1.addPassenger(passenger1);
        assertEquals(1, plane1.passengerCount());
    }

    @Test
    public void canEmptyPlane() {
        plane2.addPassenger(passenger1);
        plane2.emptyPlane();
        assertEquals(0, plane2.passengerCount());
    }
}
