import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAButton implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int RANDOM = new Random().nextInt(41);
	int score = 0;
	Date date = new Date();
	
	int idiot = 0;
	int moron = 2;
public static void main(String[] args) {
	WhackAButton buttons = new WhackAButton();
	buttons.main2();
	for (int i = 0; i < 40; i++) {
		buttons.drawButtons(i);
	}
	
}

public void main2() {
	frame = new JFrame();
	panel = new JPanel();
	RANDOM = new Random().nextInt(41);
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(370, 400);

}

public void drawButtons(int buttons){
	JButton button = new JButton();
	panel.add(button);
	if (buttons == RANDOM) {
		button.setText("MOLE!");
	}
	button.addActionListener(this);
} 
void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	JButton E = (JButton) e.getSource();
	if (idiot == 1 && E.getText().equals("")) {
		speak("Idiot!");
		idiot += 1;
	}
	else if (idiot == 2 && E.getText().equals("")) {
		speak("Moron!");
		idiot = 0;
	
	}
	else if (E.getText().equals("")) {
		speak("Dork!");
		idiot = 1;
	}
	else {
		score++;
	}
	
	
	frame.dispose();
	main2();
	for (int i = 0; i < 40; i++) {
		drawButtons(i);
	}
	if (score == 10) {
		endGame(date, score);
	}
}
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
}


}
