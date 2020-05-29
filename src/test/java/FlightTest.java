import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setUp(){
        passenger1 = new Passenger("John", 2);
        passenger2 = new Passenger("Mike", 1);
        passenger3 = new Passenger("Dick", 3);
        plane = new Plane(PlaneType.BOEING);
        flight = new Flight(plane, "E34", "BRI", "GLA", "17:00");
    }

    @Test
    public void hasFlightStartNoPassengers(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canFlightGetPassengers(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void removePassengerFromFlight() {
        flight.addPassenger(passenger1);
        flight.removePassenger();
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void checkIfAvailableSeat() {
        assertTrue(flight.checkAvailableSeat());
    }
}
