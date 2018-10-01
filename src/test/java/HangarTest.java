import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {
    Hangar hangar;
    Plane plane;

    @Before
    public void before(){
        hangar = new Hangar("Test", 1);
        plane = new Plane(PlaneType.BOEING737T);
    }

    @Test
    public void hangarHasName() {
        assertEquals("Test", hangar.getHangerName());
    }

    @Test
    public void hangarHasCapacity() {
        assertEquals(1, hangar.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneCount() {
        assertEquals(0, hangar.getPlaneCount());
    }

    @Test
    public void checkIfHangarFull() {
        assertEquals(false, hangar.hangarIsFull());
    }

    @Test
    public void canAddPlaneIfHangarNotFull() {
        hangar.addPlane(plane);
        assertEquals(1, hangar.getPlaneCount());
    }
}
