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
	public void createPath() {
		GUI.create("fieldsfx.txt");
	}
	
	public String getPlayername(int playernumber) {
		String name = JOptionPane.showInputDialog("Enter name of player " +playernumber);
		return name;
	}
	public void addPlayer(Player player){
		int r = (int) Math.random()*200+1;
		int g = (int) Math.random()*200+1;
		int b = (int) Math.random()*200+1;
		GUI.addPlayer(player.getName(), player.getBalance(), r,g,b);
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
	public void updateBalance(Player player) {
		GUI.setBalance(player.getName(), player.getBalance());
	}
	
	public void movePlayer(Player player) {
		GUI.removeAllCars(player.getName());
		GUI.setCar(player.getCurrentfield(), player.getName());
	}
	public void setOwner(Player player) {
		GUI.setOwner(player.getCurrentfield(), player.getName());
	}
	public void removePlayer(Player player) {
		GUI.removeAllCars(player.getName());
	}
	public void printWinner(Player player) {
		GUI.showMessage("Congratulations "+player.getName()+", you won the game!");
	}
	public void printTransaction1(String fieldname, Player owner, Player payer) {
		GUI.showMessage("The field "+fieldname+" is owned by "+owner.getName()+", \n"+payer.getName()+" paid the rent to "+owner.getName());
	}
	public void printTransaction2(String fieldname,Player owner, Player payer) {
		GUI.showMessage("The field "+fieldname+" is owned by "+owner.getName()+"'s children \n"+payer.getName()+" paid the rent to "+owner.getName()+"'s children");
	}
}
