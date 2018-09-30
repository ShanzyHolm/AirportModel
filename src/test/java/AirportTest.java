import org.junit.Before;
import org.junit.Test;

public class AirportTest {
    Airport airport1;
    Airport airport2;
    Airport airport3;
    Airport airport4;


    @Before
    public void before() {
        airport1 = new Airport(Airports.AMSTERDAM);
        airport2 = new Airport(Airports.FRANKFURT);
        airport3 = new Airport(Airports.KEFLAVIK);
        airport4 = new Airport(Airports.HALIFAX);
    }

    @Test
    public void getAirportName() {
    }

    @Test
    public void getAirportCode() {
    }
}
