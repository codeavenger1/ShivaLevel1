import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
public static void main(String[] args) {
	
	
	
}

void showCutenessTV() {
	JFrame frame = new JFrame();
	frame.setSize(800,800);
	JPanel panel = new JPanel();
	JButton Duck = new JButton();
	frame.add(panel);
	panel.add(Duck);
	
}

void showDucks() {
		playVideo("EpiGS-3PDU8");
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

}
