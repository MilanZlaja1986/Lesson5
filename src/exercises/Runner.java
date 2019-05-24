package exercises;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	 
	 public static void main(String[] args) {
		 Smurf handy = new Smurf("Handy", "white", "boy");
		 Smurf papa = new Smurf("Papa", "red", "boy");
		 Smurf smurfette = new Smurf("Smurfette", "white", "girl");
		 
		 List<Smurf> smurfs = new ArrayList<Smurf>();
		 smurfs.add(handy);
		 smurfs.add(papa);
		 smurfs.add(smurfette);
		 }	 
}
