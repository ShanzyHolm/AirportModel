import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AirportTest {
    private Airport airport1;
    private Airport airport2;
    private Airport airport3;
    private Airport airport4;
    private Airport airport5;
    private Airport airport6;
    private Airport airport7;
    private Hangar bigHangar;
    private Hangar mediumHangar;
    private Hangar littleHangar;
    private Plane plane1;
    private Flight flight1;
    private Flight flight2;



    @Before
    public void before() {
        bigHangar = new Hangar("One", 10);
        mediumHangar = new Hangar("Three", 6);
        littleHangar = new Hangar("Two", 2);
        flight1 = new Flight(PlaneType.RJ85AVROLINER, Flights.MOSCOW);
        flight2 = new Flight(PlaneType.BOEING767, Flights.TOKYO);
        airport1 = new Airport(Airports.AMSTERDAM);
        airport2 = new Airport(Airports.FRANKFURT);
        airport3 = new Airport(Airports.KEFLAVIK);
        airport4 = new Airport(Airports.HALIFAX);
        airport5 = new Airport(Airports.SYDNEY);
        airport6 = new Airport(Airports.LONDONG);
        airport7 = new Airport(Airports.LONDONH);
        plane1 = new Plane(PlaneType.AIRBUSA320);
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
    public void airportStartsEmpty() {
        assertEquals(0, airport1.hangarCount());
    }

    @Test
    public void canAddHangar() {
        airport4.addHangar(bigHangar);
        assertEquals(1, airport4.hangarCount());
    }

    @Test
    public void canGetHangarCapacity() {
        assertEquals(2, littleHangar.getPlaneCapacity());
    }

    @Test
    public void canGetHangarName() {
        assertEquals("One", bigHangar.getHangerName());
    }

    @Test
    public void hangarStartsEmpty() {
        assertEquals(0, mediumHangar.getPlaneCount());
    }

    @Test
    public void canAddPlaneToHangar() {
        littleHangar.addPlane(plane1);
        assertEquals(1, littleHangar.getPlaneCount());
    }

    @Test
    public void flightScheduleStartsEmpty() {
        assertEquals(0, airport5.flightCount());
    }

    @Test
    public void canAddFlightToSchedule() {
        airport6.addFlight(flight1);
        assertEquals(1, airport6.flightCount());
    }
//
//    @Test
//    public void canAssignPlaneFromHangarToFlight() {
//        ArrayList<Hangar> hangarsList = new ArrayList<Hangar>();
//        hangarsList.add(mediumHangar);
//
//
//        airport7.addFlight(flight2);
//
//        airport7.assignPlaneFromHangarToFlight(hangarsList, flight2.getFlight());
//        assertEquals("JL407", flight2.getFlightNumber());
//    }
//
//    @Test
//    public void cannotAssignPlaneToFlightAsNotInHangar() {
//    }
}
