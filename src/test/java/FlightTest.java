import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Flight flight1;
    Flight flight2;
    Flight flight3;
    Flight flight4;


    @Before
    public void before() {
        flight = new Flight(PlaneType.AIRBUSA321, Flights.VANCOUVER);
        flight1 = new Flight(PlaneType.F104STARFIGHTER, Flights.TORONTO);
        flight2 = new Flight(PlaneType.BOEING777, Flights.AMSTERDAM);
        flight3 = new Flight(PlaneType.BOEING757, Flights.KEFLAVIK);
        flight4 = new Flight(PlaneType.BOEING757V2, Flights.GLASGOW);

    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.AIRBUSA321, flight.getPlaneType());
    }

    @Test
    public void canGetFlight() {
        assertEquals(Flights.TORONTO, flight1.getFlight());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("KL1476", flight2.getFlightNumber());
    }

    @Test
    public void canGetDepartureDestination() {
        assertEquals( "Reykjavik", flight3.getDepartureDestination());
    }

    @Test
    public void canGetArrivalDestination() {
        assertEquals("Edinburgh", flight4.getArrivalDestination());
    }
}
