
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String taylorImage = "/Users/league/Documents/ShivaLevel1/src/22fe4638-d675-47f8-9726-5f43e27bb084.jpeg";
	String selenaImage = "/Users/league/Documents/ShivaLevel1/src/MTE5NDg0MDU0ODM5Mzk1ODU1.jpg";
	String adeleImage = "/Users/league/Documents/ShivaLevel1/src/adele-25-packshot.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(300, 300);
		// Make an int variable to hold the score.
			int score = 0;
		// Ask the user who this person is and store their answer
		String taylorAnswer = JOptionPane.showInputDialog("Who is this celebrity?");
		// If they got the answer right:
		if (taylorAnswer.equals("Taylor Swift")) {
			score++;
			JOptionPane.showMessageDialog(null, "CORRECT!! Moving On . . .");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!! Moving On . . .");
		}
		
		showNextImage();
		window.setSize(300,300);
		String selenaAnswer = JOptionPane.showInputDialog("Who is this celebrity?");
		if (selenaAnswer.equals("Selena Gomez")) {
			score++;
			JOptionPane.showMessageDialog(null, "CORRECT!! Moving On . . .");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!! Moving On . . .");
		}
		
		showNextImage();
		window.setSize(300, 400);
		String adeleAnswer = JOptionPane.showInputDialog("Who is this celebrity?");
		if (adeleAnswer.equals("Adele")) {
			 score++;
			JOptionPane.showMessageDialog(null, "CORRECT!! Moving On . . .");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!! ");
		}
		
		JOptionPane.showMessageDialog(null, "Your score is " + score++);
		
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(taylorImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(selenaImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(adeleImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

