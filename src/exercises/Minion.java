package exercises;

import java.util.ArrayList;
import java.util.List;


public class Minion {
	
	private String name; 
	private int eyes;
	private String color;
	private String master;
	
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	
	public static void main(String[] args) {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");
		Minion dave = new Minion("Dave", 2, "yellow", "");
		
		List<Minion> minions = new ArrayList<Minion>();
		minions.add(stuart);
		minions.add(dave);
	}
	
	public String getName() {
		return name;
	}
	
	public int getEyes() {
		return eyes;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {	
		this.master = master;
	}
}


