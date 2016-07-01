import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
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
	}
}
