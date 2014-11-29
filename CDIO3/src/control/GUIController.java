package control;
import boundaryToMatador.GUI;

import javax.swing.JOptionPane;

import entity.Player;

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
	public boolean askTax() {
		return GUI.getUserLeftButtonPressed("Do you want to pay 10% of your assets, or 4000?", "10%", "4000");
	}
	
	public String getPlayername(int playernumber) {
		String name = JOptionPane.showInputDialog("Enter name of player " +playernumber);
		return name;
	}
	public void addPlayer(Player player, int playernumber){
		if (playernumber == 1)
			GUI.addPlayer(player.getName(), player.getBalance(), 255, 0, 0);
		if (playernumber == 2)
			GUI.addPlayer(player.getName(), player.getBalance(), 0, 255, 0);
		if (playernumber == 3)
			GUI.addPlayer(player.getName(), player.getBalance(), 0, 0, 255);
		if (playernumber == 4)
			GUI.addPlayer(player.getName(), player.getBalance(), 255, 255, 0);
		if (playernumber == 5)
			GUI.addPlayer(player.getName(), player.getBalance(), 0, 0, 0);
		if (playernumber == 6)
			GUI.addPlayer(player.getName(), player.getBalance(), 255, 255, 255);
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
