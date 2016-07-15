import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	public static void main(String[] args) {
		TootMachine fart = new TootMachine();
		fart.draw();
	}
	
	void draw(){
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		panel.setVisible(true);
		button.setVisible(true);
		panel.add(button);
		button.addActionListener(this);
		button.setText("Daddy I farted");
		panel.add(button2);
		button2.addActionListener(this);
		button2.setText("loud fart lol ");
		panel.add(button3);
		button3.addActionListener(this);
		button3.setText("big fart lol");
		panel.add(button4);
		button4.addActionListener(this);
		button4.setText("constapated");
		panel.add(button5);
		button5.addActionListener(this);
		button5.setText("on and off/heartbeat");
		panel.add(button6);
		button6.addActionListener(this);
		button6.setText("Nic ate beans, so.... EWWWWW");
		
		
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			playSound("Random Son Talk-SoundBible.com-1082911145.wav");
		}
		if (e.getSource() == button2) {
			playSound("Silly_Farts-Joe-1473367952.wav");
		}
		if (e.getSource() == button3) {
			playSound("Wont Start Fart-SoundBible.com-1643093672.wav");
		}
		if (e.getSource() == button4) {
			playSound("Groan-SoundBible.com-1306380507.wav");
		}
		if (e.getSource() == button5) {
			playSound("Girls Farting-SoundBible.com-1056721802.wav");
		}
		if (e.getSource() == button6) {
			playSound("Funny Fart Trail-SoundBible.com-1691782690.wav");
		}
	}


	
}
