/**
 * 
 */
package vehicles.parking;

import automobiles.*;

/**
 * Class which simulates a parking ticket for a {@link Vehicle Vehicle} type.
 * @author Razvan Radu
 *
 */
public class ParkingTicket {

	private Vehicle ticket;
	private double distance;
	
	/**
	 * @return a {@link Double Double} number representing the distance from the gate to the parking spot, in kilometers
	 */
	public double getDistance() {
		return this.distance;
	}


	/**
	 * @param distance the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * Default constructor.
	 * @param car a {@link Car Car} type for which the ticket is issued
	 */
	public ParkingTicket(Vehicle car){	
		if (car instanceof Vehicle){
			this.ticket = car;
		} else {
			// TODO CODE REVIEW: Can the object be anything other than Vehicle? Can you show an example when ClassCastException is thrown.
			throw new ClassCastException("Invalid type of object, Vehicle or extended from Vehicle are accepted");
		}
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ticket == null) ? 0 : ticket.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ParkingTicket))
			return false;
		ParkingTicket other = (ParkingTicket) obj;
		if (ticket == null) {
			if (other.ticket != null)
				return false;
		} else if (!ticket.equals(other.ticket))
			return false;
		return true;
	}
	

	
	
}
