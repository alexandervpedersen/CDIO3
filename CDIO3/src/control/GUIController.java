package control;
import boundaryToMatador.GUI;
import javax.swing.JOptionPane;
public class GUIController {

	public int getNumOfPlayers() {
		boolean run = true;
		int n = 0;
		while (run == true) {
		String NOP = JOptionPane.showInputDialog("Enter number of players");
		n = Integer.parseInt(NOP);
		if (n >= 2 && n <= 6)
			run = false;
		}
		return n;
	}
	public String getPlayername(int playernumber) {
		String name = JOptionPane.showInputDialog("Enter name of player " +playernumber);
		return name;
	}
}
