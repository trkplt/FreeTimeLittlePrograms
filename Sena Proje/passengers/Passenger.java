
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package passengers;
import locations.*;
import vehicles.*;
import interfaces.*;

public class Passenger implements ownCar, usePublicTransport{
	private int ID;
	private boolean hasDriversLicense;
	private double cardBalance;
	private Car car;
	private Location currentLocation;
	
	public Passenger(int ID, boolean hasDriversLicense, Location l) {
		this.ID = ID;
		this.hasDriversLicense = hasDriversLicense;
		this.currentLocation = l;
	}
	
	public Passenger(int ID, Location l, double fuelConsumption){
		car = new Car(ID, fuelConsumption);
		this.ID = ID;
		this.hasDriversLicense = true;
		this.currentLocation = l;
	}

	
	public void refuel(double amount) {
		if(this.hasDriversLicense) {
			this.car.refuel(amount);
		}
	}
	
	public void drive(Location l) {
		
	}
	
	public void purchaseCar(double fuelConsumption) {
		
	}
	
	public void ride(PublicTransport p, Location l) {
		
	}
	
	public void refillCard(double amount) {
		
	}
}


//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

