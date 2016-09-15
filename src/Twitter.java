import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Twitter implements ActionListener{


public static void main(String[] args) {
	Twitter twitter = new Twitter();
	twitter.main2();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField text = new JTextField();
JLabel label = new JLabel();

 void main2(){

frame.add(panel);
panel.add(button);
panel.add(text);
panel.add(label);

button.addActionListener(this);

frame.setVisible(true);
frame.pack();
frame.setSize(500, 500);

text.setText("Write what you want to search");
button.setText("Search the Twitterverse");
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource() == button) {
		System.out.println(getLatestTweet(text.getText()));
	}
	
}
private String getLatestTweet(String searchingFor) {

	twitter4j.Twitter twitter = new TwitterFactory().getInstance();
	AccessToken accessToken = new AccessToken(
			"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
			"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
			"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	try {
		QueryResult result = twitter.search(query);
		return result.getTweets().get(0).getText();
	} catch (Exception e) {
		System.err.print(e.getMessage());
		return "What the heck is that?";
	}
}


}
