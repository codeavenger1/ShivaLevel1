import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest1Code implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField text = new JTextField();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	PracticeTest1Code code = new PracticeTest1Code();
	code.main2();
}
 void main2(){
	
	
	frame.setVisible(true);
	frame.setSize(300, 100);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(text);
	panel.add(button1);
	panel.add(button2);
	panel.add(label);
	button1.addActionListener(this);
	button2.addActionListener(this);
	text.setText("Type Your Answer Here");
	button1.setText("Submit Answer");
	button2.setText("HINT");
}
 
void stuff(){
	
 }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button2){
		System.out.println("hi");
	}
	
}
}
