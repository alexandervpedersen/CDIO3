package FieldGame;

public class Player {
	
	private String name;
	private Account account;
	private int Fleetammount = 0;
	
	public Player () {
		name = "ERROR";
		account = new Account();
	}
	
	public Player (String new_name, Account new_account) {
		this.name = new_name;
		this.account = new_account;
	}
	public void set(int ammount_of_Fleets){
		Fleetammount = ammount_of_Fleets;
	}
	public int getFleetammount() {
		return Fleetammount;
	}
	public void addFleet() {
		Fleetammount++;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String new_name) {
		this.name = new_name;
	}
	
	public int getBalance() {
		return account.getBalance();
	}
	
	public void setBalance(int new_balance) {
		account.setBalance(new_balance);
	}
	
	public void addBalance(int add) {
		account.addBalance(add);
	}
	
	public boolean CheckWin() {
		return account.CheckWin();
	}
	
	public String toString() {
		return ("The player " + name + "has the " + account.toString());
	}
}