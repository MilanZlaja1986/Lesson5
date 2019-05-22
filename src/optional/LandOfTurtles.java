package optional;

import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
	

		// 1. Instantiate a JFrame object & make it visible
		JFrame fr = new JFrame("Land of turtles");
		fr.setVisible(true);
		fr.getContentPane().add(panel);

		// 2. Add the panel to the frame
		fr.getContentPane().add(panel);

		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);

		//4. Set the size image of the frame to 600 by 400 
		final int frameWidth = 600;
		final int frameHeight = 400;

		// 5. Instantiate a Turtle
		fr.setSize(frameWidth, frameHeight);

		// 6. Add the turtle to the panel 
		Turtle turtle = new Turtle();
		panel.addTurtle(turtle);

		// 7. Put 50 Turtles on the beach
		Turtle[] turtles = new Turtle[50];
		
		for (int i = 0; i < turtles.length; i++) {
			turtles[i] = new Turtle();
			turtles[i].setX(new Random().nextInt(fr.getWidth()/2) + fr.getWidth()/2);
			turtles[i].setY(new Random().nextInt(fr.getHeight()*2/3) + fr.getHeight()/3);
			panel.addTurtle(turtles[i]);
		}
	}
}
