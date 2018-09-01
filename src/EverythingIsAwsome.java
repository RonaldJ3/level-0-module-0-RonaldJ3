import javax.swing.JOptionPane;

public class EverythingIsAwsome {
	public static void main(String[] args) {
		String sup = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, sup + " is Awesome.");
	}
}
