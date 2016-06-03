import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements MouseListener{
private static final int buttonPressed = 0;

JButton button = new JButton();
public static void main(String[] args) {
	
	Candyman candyman = new Candyman();
	candyman.main2();

}

private void main2() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setSize(500,500);
	frame.add(panel);
	panel.add(button);
	frame.setVisible(true);
	button.setText("Candyman");
	button.addMouseListener(this);
}

static final int CREEPY = 0;
static final int SCREAM = 1;

public static void playSound(int whichSound) {
File soundFile = null;
	 if (whichSound == CREEPY)
		 soundFile = new File(
				 "/Users/league/Desktop/ShivaLevel1/src/346449__joelu2001__creepy-outro-sound-effect.wav");
	 else if (whichSound == SCREAM)
		 soundFile = new File(
				 "/Users/League/Google Drive/league-sounds/scream.wav");
	 try {
		 AudioInputStream audioInputStream = AudioSystem
				 .getAudioInputStream(soundFile);
		 Clip clip = AudioSystem.getClip();
		 clip.open(audioInputStream);
		 clip.start();
		 Thread.sleep(3400);
	 } catch (Exception ex) {
		 ex.printStackTrace();
	 }
}




private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
int t = 0;
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	t+=1;
if (t == 5 && e.getSource().equals(button)) {
		
		showPictureFromTheInternet("https://s-media-cache-ak0.pinimg.com/236x/60/e0/a2/60e0a2c1bd3799a9df221e785ff63547.jpg");
		playSound(SCREAM);
		playSound(CREEPY);
		t = 0;
}

}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
