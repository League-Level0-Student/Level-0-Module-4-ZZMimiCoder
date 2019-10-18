package HappyPet;
import javax.swing.JOptionPane;
public class HappyPet {
	static int Happiness = 0;
	public static void main(String[] args) {
		String Pet = JOptionPane.showInputDialog("What Type Of Pet Would You Like To Buy?");
		while (true) {
			int Task = JOptionPane.showOptionDialog(null, "What To Do?", "Action", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Clean Up Poop", "Water", "Food" }, null);
			if (Task == 2) {
				JOptionPane.showMessageDialog(null, "Your " + Pet + " Eats");
				Happiness += 5;
			} else if (Task == 1) {
				JOptionPane.showMessageDialog(null, "Your " + Pet + " Drinks");
				Happiness += 5;
			} else if (Task == 0) {
				JOptionPane.showMessageDialog(null, "Your " + Pet + " Poops Some More");
				Happiness += 5;
			} else {
				JOptionPane.showMessageDialog(null, "ERR");
				break;
			}
			if (Happiness > 50) {
				JOptionPane.showMessageDialog(null, "You Love Your Pet");
				break;
			}
		}
	}
}