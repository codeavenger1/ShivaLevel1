import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.teachingextensions.logo.Colors.Greens;
import org.teachingextensions.logo.PenColors.Reds;

public class SpamALot implements ActionListener{
	static final String FAKE_USERNAME = "bobsusudeboblo@gmail.com";
	static final String FAKE_PASSWORD = "thedeboblofam";

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JTextField text = new JTextField(15);
public static void main(String[] args) {
	SpamALot spam = new SpamALot();
	spam.main2();
}

void main2() {
	frame.setSize(500,500);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(text);
	text.setText("Phone Number/Email");
	panel.add(button);
	button.setText("GOOD");
	button.addActionListener(this);
	panel.add(button2);
	button2.setText("BAD");
	button2.addActionListener(this);
	frame.pack();
}

private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
e.printStackTrace();
return false;
		}
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (button == e.getSource()) {
		if (sendSpam("dipulk@gmail.com, helloanjaligupta@gmail.com, shivakansagara@gmail.com", "Congratulations!", "Congratulations! You've won two first class airplane tickets to Kauai! You will be staying at the Grand Hyatt in Poipoo for seven days! Enjoy, Bob Susu Deboblo")) {
			text.setBackground(Color.GREEN);
		}
		
			else{
				text.setBackground(Color.RED);
			}
	}
	if (button2 == e.getSource()) {
		if (sendSpam("sgkansagara@gmail.com, shivakansagara@gmail.com", "I'm coming for you", "J.K. OH YEAYEAYEA. lol")) {
			text.setBackground(Color.GREEN);
		}
		
			else{
				text.setBackground(Color.RED);
			}
	}
}

}
