
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package vehicles;

public class Car{
	private int ownerID;
	private double fuelAmount;
	private double fuelConsumption;
	
	public Car(int ID, double fuelConsumption) {
		this.ownerID = ID;
		this.fuelConsumption  = fuelConsumption;
		this.fuelAmount = 0;
	}
	
	public void refuel(double amount) {
		this.fuelAmount += amount;
	}
}


//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

