import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AirportTest {
    Airport airport1;
    Airport airport2;
    Airport airport3;
    Airport airport4;
    Airport airport5;
    Hangar bigHangar;
    Hangar littleHangar;


    @Before
    public void before() {
        bigHangar = new Hangar("One", 10);
        littleHangar = new Hangar("Two", 2);
        airport1 = new Airport(Airports.AMSTERDAM);
        airport2 = new Airport(Airports.FRANKFURT);
        airport3 = new Airport(Airports.KEFLAVIK);
        airport4 = new Airport(Airports.HALIFAX);
        airport5 = new Airport(Airports.SYDNEY);

    }

    @Test
    public void canGetAirportName() {
        assertEquals("Schiphol", airport1.getAirportName());
    }

    @Test
    public void canGetAirportCode() {
        assertEquals("FRA", airport2.getAirportCode());
    }

    @Test
    public void canGetCountryOfOrigin() {
        assertEquals("Iceland", airport3.getCountryOfOrigin());
    }

    @Test
    public void hangarStartsEmpty() {
        assertEquals(0, airport1.planeCount());
    }

    @Test
    public void canAddHangar() {
        airport4.addHangar(bigHangar);
        assertEquals(1, airport4.planeCount());
    }

    @Test
    public void canGetHangarCapacity() {
        assertEquals(2, littleHangar.getPlaneCapacity());
    }

    @Test
    public void canGetHangarName() {
        assertEquals("One", bigHangar.getHangerName());
    }
}
