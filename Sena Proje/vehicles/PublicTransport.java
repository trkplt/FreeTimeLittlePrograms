
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package vehicles;
import locations.*;

public abstract class PublicTransport {
	private int ID;
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	public PublicTransport(int ID, double x1, double y1, double x2, double y2) {
		this.ID = ID;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	private boolean inRangeX(double x){
		if(x1 < x2){
			return x >= x1 && x <= x2;
		}else{
			return x <= x1 && x >= x2;
		}
	}

	private boolean inRangeY(double y){
		if(y1 < y2){
			return y >= y1 && y <= y2;
		}else{
			return y <= y1 && y >= y2;
		}
	}

	public boolean canRide(Location departure, Location arrival) {
		/*
		double height = Math.abs(this.y2 - this.y1);
		double width = Math.abs(this.x2 - this.x1);
		
		return Math.abs(arrival.getLocationY() - departure.getLocationY()) <= height && 
				Math.abs(arrival.getLocationX() - departure.getLocationX()) <= width;

		 */

		return inRangeX(departure.getLocationX()) && inRangeY(departure.getLocationY()) &&
				inRangeX(arrival.getLocationX()) && inRangeY(arrival.getLocationY());
	}

	public abstract double getPrice(Location departure, Location arrival);

	public abstract double getDiscount();
}


//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE





