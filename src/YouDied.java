import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.RandomAccessFile;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class YouDied implements ActionListener {
	JFrame grapeFrame;
	JButton strawberryButton;
	int i = 0;
	Random randomNumber;
	
	public static void main(String[] args) {
		new YouDied().getGoing();
	}

	void getGoing() {
		grapeFrame = new JFrame();
		grapeFrame.setSize(500, 500);
		grapeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		strawberryButton = new JButton();
		strawberryButton.addActionListener(this);
		grapeFrame.add(strawberryButton);
		grapeFrame.setVisible(true);
		randomNumber = new Random();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(i++);
		
		if (i == randomNumber.nextInt(37)) {
			JOptionPane.showMessageDialog(null, "You died!");
		}
	}
}
