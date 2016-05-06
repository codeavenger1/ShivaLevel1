import javax.swing.JFrame;
import javax.swing.JPanel;

public class BinaryConverter {
public static void main(String[] args) {
	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
}

String convert(String binary) {
  	 int asciiValue = Integer.parseInt(binary, 2);
  	 char theLetter = (char) asciiValue;
  	 return "" + theLetter;
   }
}
