package SleepyHead;
import javax.swing.JOptionPane;
public class SleepyHead {
    public static void main(String[] args) {
        boolean IsWeekday, IsVacation;
        int CurrValue = JOptionPane.showConfirmDialog(null, "ˆß ˆ† ˇ˙´ „´´˚´˜∂¿", "Í¬´´π¥ ˙∑å∂", JOptionPane.YES_NO_OPTION);
        if (CurrValue == 1) {
        	IsWeekday = false;
        } else {
        	IsWeekday = true;
        }
        CurrValue = JOptionPane.showConfirmDialog(null, "Å®´ Áø¨ Ø˜ ◊åçå†ˆø˜¿", "Í¬´´π¥ ˙´å∂", JOptionPane.YES_NO_OPTION);
        if (CurrValue == 1) {
        	IsVacation = false;
        } else {
        	IsVacation = true;
        }
        if (!IsWeekday || IsVacation) {
        	System.out.println("Í¬´´π ˆ");
        } else {
        	System.out.println("˝´† ¨π Áø¨ ÒåΩ¥ Åßß⁄⁄⁄");
        }
    }
}
