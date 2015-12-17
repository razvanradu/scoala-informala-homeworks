package vehicles.parking;

import org.junit.Before;
import org.junit.Test;
import automobiles.*;

/**
 * Class used for unit testing of the {@link ParkingTicket ParkingTicket class}.
 * @author Razvan Radu
 *
 */
public class ParkingTicketTest {

	
	private Camel camel;
	private Tank tank;
	private Car car1;

	@Before
	public void setup(){
		camel = new Camel("Johnny");
		tank = new Tank("M4A1 Abrams");
		car1 = new Insignia(40 , "W09galgue");
	}
	
	@Test
	public void checkValidTicket() {
		ParkingTicket ticket = new ParkingTicket(tank);
	}
	
	@Test(expected = ClassCastException.class)
	public void checkInvalidTicket() {
		ParkingTicket ticket = new ParkingTicket((Vehicle)camel);
	}
	
}
