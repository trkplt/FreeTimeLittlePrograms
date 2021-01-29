
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package locations;
import passengers.*;
import java.util.*;

public class Location{
	private int ID;
	private double locationX;
	private double locationY;
	private ArrayList<Passenger> history;
	private ArrayList<Passenger> current;
	
	public Location(int ID, double locationX, double locationY) {
		this.ID = ID;
		this.locationX = locationX;
		this.locationY = locationY;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public double getLocationX() {
		return this.locationX;
	}
	
	public double getLocationY() {
		return this.locationY;
	}
	
	public double getDistance(Location other) {
		double dy = other.locationY - this.locationY;
		double dx = other.locationX - this.locationX;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
	
	public void incomingPassenger(Passenger p) {
		current.add(p);
		history.add(p);
	}
	
	public void outgoingPassenger(Passenger p) {
		current.remove(p);
	}
}


//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

