import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FlightManagerTest {

    Flight flight;
    Plane plane;
    FlightManager flightmanager;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    @Before
    public void setUp(){
        plane = new Plane(PlaneType.CONCORDE);
        flight = new Flight(plane, "E34", "BRI", "GLA", "17:00");
        flightmanager = new FlightManager(flight);

        passenger1 = new Passenger("John", 2);
        passenger2 = new Passenger("Mike", 1);
        passenger3 = new Passenger("Dick", 3);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);


    }

    @Test
    public void getTotalPLaneLuggageWeight() {
        assertEquals(1500, flightmanager.totalPlaneLuggageWeight(),0.01);
    }

    @Test
    public void getTheAllowedBaggagePassengerWeigth(){
        assertEquals(7.5, flightmanager.allowedBaggageWeigth(),0.01);
    }

    @Test
    public void getBaggageWeigthPerFlight() {
        assertEquals(45.00, flightmanager.totalBaggageWeigth(),0.01);
    }

    @Test
    public void reservedLeftBaggageFlightWeigth() {
        assertEquals(1455.00, flightmanager.leftBaggage(),0.01 );
    }


}
