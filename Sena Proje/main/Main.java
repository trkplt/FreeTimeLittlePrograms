
//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

package main;

import java.util.*;
import vehicles.*;
import java.io.*;
import passengers.*;
import locations.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File(args[0]));
		Scanner output = new Scanner(new File(args[1]));

		ArrayList<Passenger> passengers = new ArrayList<Passenger>();
		ArrayList<Location> locations = new ArrayList<Location>();
		ArrayList<PublicTransport> vehicles = new ArrayList<PublicTransport>();
		
		// Uncomment the lines below after implementing the Location class
		
	    Location l = new Location(0, 0, 0); // The first location is always (0,0).
	    locations.add(l);
		int operations = input.nextInt(); // operation count
	}

}


//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

