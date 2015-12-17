/**
 * 
 */
package vehicles.parking;

import automobiles.*;

/**
 * @author rlu
 *
 */
public class ValletParkingTicket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ValletParking<Car> carPark = new ValletParking<Car>();
		Car car1 = new Astra(20, "W0L0bgabi");
		
		Car car2 = new Logan(30 , "geiahgegy");
		
		Car car3 = new Logan(20 , "gg75ge64gy");
		
		float availableFuel1 = car2.getAvailableFuel();
		System.out.println("Car 2 initial fuel:" + availableFuel1);
		ParkingTicket ticket1 = carPark.parkVehicle(car1);
		ParkingTicket ticket2 = carPark.parkVehicle(car2);
		float availableFuel2 = car2.getAvailableFuel();
		System.out.println("Car 2 fuel after parking:" + availableFuel2);
		Car car4 = carPark.retrieveVehicle(ticket2);
		float availableFuel3 = car4.getAvailableFuel();
		System.out.println("Car 2 fuel after retrieval:" + availableFuel3);
		System.out.println(car2.equals(car4));
		System.out.println(car2.equals(car3));
		ValletParking<Helicopter> heliPark = new ValletParking<Helicopter>();
		Helicopter heli1 = new Helicopter("AlphaBravoDelta");
		ParkingTicket ticket3 = heliPark.parkVehicle(heli1);
		System.out.println(heli1.getHelicopterName());
		heliPark.retrieveVehicle(ticket3);

	}

}
