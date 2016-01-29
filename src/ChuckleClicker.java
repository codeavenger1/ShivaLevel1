import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
public static void main(String[] args) {
	ChuckleClicker buttons = new ChuckleClicker();
	buttons.makebuttons();
	
	
}
JButton b = new JButton();
JButton but = new JButton();


void makebuttons()
{
	
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500, 500);
	JPanel panel = new JPanel();
	
	
	panel.add(b);
	panel.add(but);
	frame.add(panel);
	b.setText("joke");
	but.setText("punchline");
	b.addActionListener(this);
	but.addActionListener(this);
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	
	
	if(e.getSource() == b)
	{
		JOptionPane.showMessageDialog(null, "Why don't pteredactals go to the bathroom?");
		
	}

	else {
		JOptionPane.showMessageDialog(null, "Because the 'p' is silent");
	}
}

}
