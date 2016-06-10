import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

public static void main(String[] args) {
	TypingTutor tutor = new TypingTutor();
	tutor.main2();

}

void main2() {
currentLetter = generateRandomLetter();
	
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(400, 200);
	frame.addKeyListener(this);
	frame.setTitle("Type or DIE");
	frame.add(panel);
	panel.add(label);
	
	label.setText(currentLetter+"");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);	

}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	
	if (e.getKeyChar() == currentLetter) {
		System.out.println("correct");
		panel.setBackground(Color.green);
	}
	else {
		panel.setBackground(Color.red);
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(currentLetter+"");
}
}
