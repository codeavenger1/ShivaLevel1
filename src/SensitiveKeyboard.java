import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class SensitiveKeyboard extends KeyAdapter{
	JFrame frame = new JFrame();
public static void main(String[] args) {
	SensitiveKeyboard cake = new SensitiveKeyboard();
	cake.ouch();
}
public void keyPressed(KeyEvent e){
	speak("OUCH!");
}
void ouch(){
	frame.setVisible(true);
	frame.addKeyListener(this);
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }

}
