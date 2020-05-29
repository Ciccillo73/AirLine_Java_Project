import org.junit.Before;

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

}
