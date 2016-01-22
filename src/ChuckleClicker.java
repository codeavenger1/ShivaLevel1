import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker {
public static void main(String[] args) {
	ChuckleClicker buttons = new ChuckleClicker();
	buttons.makebuttons();
	
	
}
void makebuttons()
{
	
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500, 500);
	JPanel panel = new JPanel();
	JButton b = new JButton();
	JButton but = new JButton();
	panel.add(b);
	panel.add(but);
	frame.add(panel);
}

}
