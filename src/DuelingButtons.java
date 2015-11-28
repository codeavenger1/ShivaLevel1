
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {
	
	public static void main(String[] args) {
		new DuelingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JButton middleButton = new JButton ();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame("Demanding Buttons");
	JPanel panel = new JPanel();

	int counter = 0;
	
	private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
		
		panel.add(leftButton);
		leftButton.setText("Click me!");
		
		panel.add(rightButton);
		rightButton.setText("Click me!");
		
		panel.add(middleButton);
				
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		middleButton.addActionListener(this);
		
		frame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if (buttonPressed == leftButton) {
			rightButton.setText("No, click me!");
			rightButton.setPreferredSize(BIG);
			leftButton.setText("Click me!");
			leftButton.setPreferredSize(SMALL);
		}
		
		if (buttonPressed == rightButton) {
			leftButton.setText("No, click me!");
			leftButton.setPreferredSize(BIG);
			rightButton.setText("Click me!");
			rightButton.setPreferredSize(SMALL);
		}
				
		
			frame.add(panel);
			middleButton.setText("Click me!");
			
			if (counter == 10) {
			middleButton.setText("CLICK ME!!!! ");
			middleButton.setPreferredSize(BIG);
		}
		/* If the buttonPressed was the leftButton....*/
			// Set the text of the rightButton to "No, click Me!"
			// Set the PREFERRED size of the rightButton to BIG
			// Set the text of the leftButton to "Click Me!"
			// Set the PREFERRED size of the leftButton to SMALL
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		

		frame.pack();
	}
}
