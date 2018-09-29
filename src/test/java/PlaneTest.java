import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    Plane plane1;
    Plane plane2;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUS330);
        plane1 = new Plane(PlaneType.AIRBUSA380);
        plane2 = new Plane(PlaneType.BOEING747400);

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
}
