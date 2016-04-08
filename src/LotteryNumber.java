import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {
	public static void main(String[] args) {
		Random rando = new Random();

		String numba = JOptionPane.showInputDialog("Gimme a numba between 1 and 50");
		String number = JOptionPane.showInputDialog("Gimme a numba between 1 and 50");
		String numb = JOptionPane.showInputDialog("Gimme a numba between 1 and 50");
		String num = JOptionPane.showInputDialog("Gimme a numba between 1 and 50");
		String numero = JOptionPane.showInputDialog("Gimme a numba between 1 and 50");

		int num1 = rando.nextInt(50);
		int num2 = rando.nextInt(50);
		int num3 = rando.nextInt(50);
		int num4 = rando.nextInt(50);
		int num5 = rando.nextInt(50);

		int n1 = Integer.parseInt(numba);
		int n2 = Integer.parseInt(number);
		int n3 = Integer.parseInt(numb);
		int n4 = Integer.parseInt(num);
		int n5 = Integer.parseInt(numero);

		if (n1 == num1) {
			JOptionPane.showMessageDialog(null, "You win a UNICORN!!!!!");
		}

		if (n2 == num2) {
			JOptionPane.showMessageDialog(null, "You win a MANSION!!!!!");
		}

		if (n3 == num3) {
			JOptionPane.showMessageDialog(null, "You win a PRIVATE AIRPLANE WITH A PILOT AND COMPLIMENTARY SODAS!!!!!");
		}

		if (n4 == num4) {
			JOptionPane.showMessageDialog(null, "You win a TRIP TO WILLY WONKA'S CHOCOLATE FACTORY!!!!!");
		}

		if (n5 == num5) {
			JOptionPane.showMessageDialog(null, "You win a PENCIL WITH A COMPLIMENTARY ERASER!!!!!");
		}

		else {
			JOptionPane.showMessageDialog(null, "you lose. play again if you want to win.");
		}
	}
}
