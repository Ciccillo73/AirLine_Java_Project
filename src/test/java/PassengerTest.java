import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.debugger.cdbg.basic.BasicRefType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("John",2);
    }

    @Test
    public void hasName(){
        assertEquals("John", passenger.getName());
    }

    @Test
    public void hasBags(){
         assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void checkIfPassengerHasFlight__doNotHave() {
        assertFalse(passenger.hasFlight());
    }




}
