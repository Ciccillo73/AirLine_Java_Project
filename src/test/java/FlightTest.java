import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void canAddPassengersIfThereIAvailableSeat(){
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

    @Test
    public void checkNotAvailableSeat() {
        Plane plane = new Plane(PlaneType.SMALLJET );
        Flight flight = new Flight(plane, "E34", "BRI", "GLA", "17:00");
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertFalse(flight.checkAvailableSeat());
    }

    @Test
    public void checkIfPassengerIsAlreadyBooked() {
        flight.addPassenger(passenger1);

        assertTrue(flight.checkIfPassengerAlreadyInTheList(passenger1));
    }
}
