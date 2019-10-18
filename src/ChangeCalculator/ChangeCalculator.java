package ChangeCalculator;
import javax.swing.JOptionPane;
public class ChangeCalculator {
	public static void main(String[] args) {
		String NickelString = JOptionPane.showInputDialog("How Many Nickels Do You Have?");
		int NickelInt = Integer.parseInt(NickelString);
		String DimeString = JOptionPane.showInputDialog("How Many Dimes Do You Have?");
		int DimeInt = Integer.parseInt(DimeString);
		String QuarterString = JOptionPane.showInputDialog("How Many Quarters Do You Have?");
		int QuarterInt = Integer.parseInt(QuarterString);
		int TotalMoney = NickelInt * 5 + DimeInt * 10 + QuarterInt * 25;
		JOptionPane.showMessageDialog(null, "You Have " + TotalMoney + "¢");
	}
}

