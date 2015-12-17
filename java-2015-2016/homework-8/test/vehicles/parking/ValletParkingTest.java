/**
 * 
 */
package vehicles.parking;

import org.junit.Before;
import org.junit.Test;
import automobiles.*;
import junit.framework.Assert;

/**
 * Implemented a modification so any {@link Car Car type} automatically calls {@link Car#shiftGear(int) shiftGear(1)} within the {@link Car#start() start() method}
 * @author Razvan Radu
 *
 */
public class ValletParkingTest {

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
	public void checkValidConstructorCar(){
		ValletParking<Car> carPark = new ValletParking<>();
	}
	
	@Test
	public void checkValidConstructorTank(){
		ValletParking<Tank> carPark = new ValletParking<>();
	}
	
	@Test
	public void checkParkVehicleRunning(){
		ValletParking<Car> carPark = new ValletParking<>();
		
		ParkingTicket ticket = carPark.parkVehicle(car1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void checkParkVehicleNotRunning(){
		ValletParking<Car> carPark = new ValletParking<>();
		
		ParkingTicket ticket = carPark.parkVehicle(car1);
		ParkingTicket ticket2 = carPark.parkVehicle(car1);
	}
	
	@Test
	public void checkRetrieveVehicleRunning(){
		ValletParking<Car> carPark = new ValletParking<>();
		
		ParkingTicket ticket = carPark.parkVehicle(car1);
		Car car2 = carPark.retrieveVehicle(ticket);
		Assert.assertTrue(car2.equals(car1));
	}
	
	@Test(expected = NullPointerException.class)
	public void checkRetrieveVehicleException(){
		ValletParking<Car> carPark = new ValletParking<>();
		ParkingTicket ticket = new ParkingTicket(car1);
		Car car2 = carPark.retrieveVehicle(ticket);
	}
}
