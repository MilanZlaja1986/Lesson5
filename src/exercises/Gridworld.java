package exercises;
/* 
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. Add another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;



public class Gridworld {
 
	public static void main(String[] args) {
		
		World <Actor> world1 = new World<Actor>();
		world1.show();
		
		int x = world1.getGrid().getNumRows();
		int y = world1.getGrid().getNumCols();
		int j = new Random().nextInt(x);
		int k = new Random().nextInt(y);
		
		Location loc = new Location(x-j, y-k);
		
		Bug bug1 = new Bug(Color.black);
		world1.add(loc, bug1);
		
		Location randomLoc = world1.getRandomEmptyLocation();
		Bug bugs = new Bug(Color.black);
		world1.add(randomLoc, bugs);
		
		bugs.setColor(Color.black);
		bugs.turn();
		bugs.turn();
		
		Flower f1 = new Flower(Color.yellow);
		
		if (randomLoc.getCol() - 1 >= 0) {
			Location left = new Location(randomLoc.getRow(), randomLoc.getCol() - 1);
			world1.add(left, f1);
		}
		if (randomLoc.getCol() + 1 < y) {
			Location right = new Location(randomLoc.getRow(), randomLoc.getCol() + 1);
			world1.add(right, f1);
		}
		
		int field = x * y - world1.getGrid().getOccupiedLocations().size();
		Flower flowers = new Flower();
		while (field > 0) {
			world1.add(world1.getRandomEmptyLocation(), flowers);
			field--;
		}		
	}

   
   
}
