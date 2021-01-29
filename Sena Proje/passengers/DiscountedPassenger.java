
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package passengers;

import locations.*;
import vehicles.PublicTransport;

public class DiscountedPassenger extends Passenger{
	
	public DiscountedPassenger(int ID, boolean hasDriversLicense, Location l) {
		super(ID, hasDriversLicense, l);
	}
	
	public DiscountedPassenger(int ID, Location l, double fuelConsumption) {
		super(ID, l, fuelConsumption);
	}

	public void ride(PublicTransport p, Location l){
		//getPrice ile geleni (1 - getDiscount) ile çarparak fiyat hesapla
	}
}

//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

