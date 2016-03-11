
// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton, fifthButton, sixButton;

	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.show();
		// 2. Give your frame a title
		frame.setTitle("Jeopardy");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel panel = createHeader("Music and the Artists");

		// 4. Add the header component to the quizPanel
		quizPanel.add(panel);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		firstButton = createButton("$200");
		// 7. Add the firstButton to the quizPanel
		quizPanel.add(firstButton);
		// 8. Write the code inside the createButton() method below. Check that your game looks like Figure 1 in the
		// Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton method
		secondButton = createButton("$400");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);

		thirdButton = createButton("$600");
		quizPanel.add(thirdButton);

		fourthButton = createButton("$800");
		quizPanel.add(fourthButton);

		fifthButton = createButton("$1000");
		quizPanel.add(fifthButton);

		sixButton = createButton("Instructions");
		quizPanel.add(sixButton);

		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		fifthButton.addActionListener(this);
		sixButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below

		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * 13. Use the method provided to play the Jeopardy theme music
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a question [optional] Add new topics for
	 * the quiz
	 */

	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton button = new JButton(dollarAmount);
		// Set the text of the button to the dollarAmount

		// Increment the buttonCount (this should make the layout vertical)
		buttonCount++;
		// Return your new button instead of the temporary button
		return button;
		// return new JButton("temporary button");
	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:

		// Use the method that plays the jeopardy theme music.
		playJeopardyTheme();
		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		if (buttonPressed.equals(sixButton)) {
			JOptionPane.showMessageDialog(null,
					"INSTRUCTIONS: HOW TO JEOPARDY!!!" + "1. Click an amount of money on the game board"
							+ " 2. You must answer the question in a 'Who is' 'What is' or 'When is' format"
							+ " 3. If you get the answer correct you earn the question value money. Whereas if you fail to get the question correct, you lose the value of money the question may contain from your current amount of money."
							+ " 4. The game is over when you have as much money as you want :)");
		}

		if (buttonPressed.equals(firstButton)) {
			askQuestion("Taylor Swift was born in this year. Hint: She named one on of her albums this", " 'When is 1989?'", 200);
		}

		if (buttonPressed.equals(secondButton)) {
			askQuestion("One word -- HELLO!", " 'Who is Adele?'", 400);
		}

		if (buttonPressed.equals(thirdButton)) {
			askQuestion("Twenty One Pilots sang this hit song.", " 'What is Stressed Out?'", 600);
		}

		if (buttonPressed.equals(fourthButton)) {
			askQuestion("Who performed in the Superbowl this year? (2016)", " 'Who is Beyonce, Coldplay, and Bruno Mars?'", 800);
		}

		if (buttonPressed.equals(fifthButton)) {
			askQuestion("How many licks does it take to get to the center of a tootsie pop?", "--actually, i dont know, figure it out on ur own time. trollolololol", 1000);
		}

		// Call the askQuestion() method

		// Fill in the askQuestion() method. When you play the game, the score should change.

		// Or if the buttonPressed was the secondButton

		// Call the askQuestionRecipe with a harder question

		// Clear the button text (set the button text to nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message

		// Use a pop up to ask the user the question
		String Pilots = JOptionPane.showInputDialog(null, question);
		if (Pilots.equals(correctAnswer)) {
			score = score + prizeMoney;
			updateScore();
			JOptionPane.showMessageDialog(null, "You are . . . CORRECT!! Click another amount of money to continue playing.");
		}

		else {
			score = score - prizeMoney;
			JOptionPane.showMessageDialog(null, "UH NO. The correct answer is" + correctAnswer + " Click another amount of money to continue playing.");
			updateScore();
		}

		// If the answer is correct
		// Increase the score by the prizeMoney
		// Call the updateScore() method
		// Pop up a message to tell the user they were correct
		// Otherwise
		// Decrement the score by the prizeMoney
		// Pop up a message to tell the user the correct answer
		// Call the updateScore() method

	}

	public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
