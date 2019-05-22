package optional;

import java.util.Scanner;

public class Platypus {
	private String name;

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public Platypus() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You have a new little pet.");
		System.out.println("Give your little pet a name.");
		this.name = sc.next();
		
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus plat = new Platypus();
		
		//2. Call the sayHi method
		plat.sayHi();
				
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}


