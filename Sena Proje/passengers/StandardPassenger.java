
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package passengers;
import locations.*;

public class StandardPassenger extends  Passenger{
	
	public StandardPassenger(int ID, boolean hasDriversLicense, Location l) {
		super(ID, hasDriversLicense, l);
	}
	
	public StandardPassenger(int ID, Location l, double fuelConsumption) {
		super(ID, l, fuelConsumption);
	}
}


//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

