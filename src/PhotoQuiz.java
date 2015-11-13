
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		
		String picture = "http://i.ytimg.com/vi/O56p5nOYNHo/0.jpg";
		
		Component image = createImage(picture);
		
		
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String cool = JOptionPane.showInputDialog("Which one is the coolist? LOL");
		// 7. print "CORRECT" if the user gave the right answer
		if (cool.equals("batman")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!!");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it
		String pic = "http://cdn.newsbusters.org/images/Tribute-to-the-Troops-Cena-645x370.jpg";
		// 11. add the second image to the quiz window
		Component photo = createImage(pic);
		quizWindow.add(photo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String cena = JOptionPane.showInputDialog("Who is that?");
		// 14+ check , say if correct or incorrect, etc.
		if (cena.equalsIgnoreCase("john cena")) {
			JOptionPane.showMessageDialog(null,"CORRECT!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}













































