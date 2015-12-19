
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class simonSays extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Make a JFrame variable
	JFrame grapeFrame = new JFrame();

	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int simonSays = 0;
	Date timeAtStart;
	int randomSays;

	private void makeAlbum() {
		// 2. add 4 images which match keyboard keys like this: images.put(new
		// Integer(KeyEvent.VK_UP), "image.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "imgres.png");
		images.put(new Integer(KeyEvent.VK_LEFT), "imgres-1.png");
		images.put(new Integer(KeyEvent.VK_UP), "imgres-3.png");
		images.put(new Integer(KeyEvent.VK_DOWN), "imgres-2.png");

		// 3. Tell the user to "Press the matching key when 'Simon says'
		// otherwise press a different key"
		JOptionPane.showMessageDialog(null, "Shiva Says");
		JOptionPane.showMessageDialog(null,
				"Instructions: Press the matching key when 'Shiva says' otherwise press a different key");
		// 4. call the method to show an image
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// 16. make a points variable to track the score. tell the user their score at the end.

		int points = 0+1;
		
		// 17. "press this key" --> if the key pressed equals the key on the screen, no point
		// "press this key" --> if the key pressed does not equal the key on the screen, yes point
		
		

		// 18. "shiva says press this key" --> if the key pressed equals the key on the screen, yes point
		// "shiva says press this key" --> if the key pressed does not equal the key on the screen, no point
		
		if (randomSays == 0 && keyCode == imageIndex ){
			JOptionPane.showMessageDialog(null, "Your score is " + points);
		}
	

		// 19. Use the speak method to tell the user if they were correct or not
		// 13. increment tries by 1
		tries += 1;
		// 14. if tries is greater than 9 (or however many you want)
		if (tries == 3) {
			System.exit(0);
		}
		// 15. exit the program
		System.exit(0);
		// 11. dispose of the frame
		grapeFrame.dispose();

		// 12. call the method to show an image
		showImage();
	}

	private void showImage() {
		// 5. initialize your frame to a new JFrame()
		grapeFrame = new JFrame();
		// 6. set the frame to visible
		grapeFrame.setVisible(true);
		// frame.add(getNextRandomImage()); //7. rename to the name of your
		// frame
		grapeFrame.add(getNextRandomImage());
		// 8. set the size of the frame
		grapeFrame.setSize(500, 500);
		// 9. add a key listener to the frame
		grapeFrame.addKeyListener(this);
		// 10. Use the speak method to either say "Simon says press this key" or
		// "Press this key"
		// Hint: use the simonSays int and a random number
		new Random().nextInt(2);
		if (randomSays == (0)) {
			speak("Shiva says press this key");
		} else {
			speak("Press this key");
		}
		System.out.println(randomSays);
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new simonSays().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new
 * Date();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */
