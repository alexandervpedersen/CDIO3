package control;
import boundaryToMatador.GUI;
import javax.swing.JOptionPane;
import fieldgame.Player;

public class GUIController {

	public int getNumOfPlayers() {
		boolean run = true;
		int n = 0;
		while (run == true) {
		String NOP = JOptionPane.showInputDialog("Enter number of players (between 2-6)");
		n = Integer.parseInt(NOP);
		if (n >= 2 && n <= 6)
			run = false;
		else
			JOptionPane.showMessageDialog(null, "Enter between 2-6 players", "ERROR", JOptionPane.PLAIN_MESSAGE);
		}
		return n;
	}
	public String getPlayername(int playernumber) {
		String name = JOptionPane.showInputDialog("Enter name of player " +playernumber);
		return name;
	}
	public void addPlayer(Player player){
		GUI.addPlayer(player.getName(), player.getBalance());
	}
	
	
}
