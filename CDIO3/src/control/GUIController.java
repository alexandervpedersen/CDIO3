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
	public boolean checkWilling() {
		return GUI.getUserLeftButtonPressed("This Field is not owned, do you wish to buy it?", "YES", "NO");
	}
	public void throwDice(Player player) {
		GUI.getUserButtonPressed(player+" press THROW to throw the dice", "THROW");
	}
	public void showDice(int dice1, int dice2) {
		GUI.setDice(dice1, dice2);
	}
	public void movePlayer(Player player) {
		GUI.removeAllCars(player.getName());
		GUI.setCar(player.getCurrentfield(), player.getName());
	}
	public void setOwner(Player player, int fieldnumber) {
		GUI.setOwner(fieldnumber, player.getName());
	}
	public void removePlayer(Player player) {
		GUI.removeAllCars(player.getName());
	}
	public void printWinner(Player player) {
		GUI.showMessage("Congratulations"+player.getName()+", you won the game!");
	}
	
}
