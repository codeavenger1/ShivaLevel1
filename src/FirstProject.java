import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;

public class FirstProject {
public static void main(String[] args) {
	
	String name = JOptionPane.showInputDialog("What is your name?");
	String year =JOptionPane.showInputDialog("What year were you born?");
	int num = Integer.parseInt(year);
	int now = 2015;
	int number = now - num;
	if (number>30) {
		JOptionPane.showMessageDialog(null, "You are too old to continue.");
	}
	else {
		 String gender = JOptionPane.showInputDialog(null, "Are you a girl or boy?");
			String hair =	JOptionPane.showInputDialog(null, "Do you have long hair or short hair?");
			String country = JOptionPane.showInputDialog("Where are you from?");
			JOptionPane.showMessageDialog(null, name + ", you are " + number + " years old. You are a " + gender + ". You have " + hair + "." + " You are from " + country + ".");
			String correct = JOptionPane.showInputDialog(null, "Is all of this information correct?");
			if (correct == "yes") {
				JOptionPane.showMessageDialog(null, "Great! Have a good day!");
			}
			else {
				JOptionPane.showMessageDialog(null, "You are an alien.");
			}
	}
	 
}
}
