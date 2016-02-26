
import java.util.Random;

import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		/* 1. Get the panel to show */
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		/* 2. Set the background image of the panel to the Galapagos Islands */
		panel.setBackgroundImage(galapagosIslands);
		/* 3. Instantiate a Turtle and add it to the panel */
		/* 4. Put 50 Turtles on the beach. */
		for (int i = 0; i < 40; i++) {
			Turtle green = new Turtle();
			panel.addTurtle(green);
			green.setX(new Random().nextInt(500) + 450);
			green.setY(new Random().nextInt(500) + 375);
		}
	}
}
