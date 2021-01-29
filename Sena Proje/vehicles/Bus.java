
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package vehicles;

import locations.Location;

public class Bus extends PublicTransport{

    private final double discount = 0.5;

    public Bus(int ID, double x1, double y1, double x2, double y2) {
        super(ID, x1, y1, x2, y2);
    }

    public double getPrice(Location departure, Location arrival){
        return 2;
    }

    public double getDiscount(){
        return discount;
    }
}


//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

