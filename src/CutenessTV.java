import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	JButton Duck;
	
public static void main(String[] args) {
	
	CutenessTV tv = new CutenessTV(); 
	tv.showCutenessTV();
	
}

void showCutenessTV() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(800,800);
	JPanel panel = new JPanel();
	 Duck = new JButton();
	frame.add(panel);
	panel.add(Duck);
	Duck.setText("Duck");

	JButton Frog = new JButton();
	frame.add(panel);
	panel.add(Frog);
	Frog.setText("Frog");
	
	JButton FluffyUnicorns = new JButton();
	frame.add(panel);
	panel.add(FluffyUnicorns);
	FluffyUnicorns.setText("Unicorn");
	
	
	
}

void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == Duck)
		{
			showDucks();
		}
	}

}
