package FieldGame;

public class Player{
	private String name;
	private Account account;
	private boolean isAlive = true;
	private int currenttile = 1;
	
	public Player(){
		name = "";
		account = new Account();
		isAlive = true;
		currenttile = 1;
	}
	
	public Player(String name){
		this.name = name;
		account = new Account();
		isAlive = true;
		currenttile = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getCurrenttile() {
		return currenttile;
	}

	public void setCurrenttile(int currenttile) {
		this.currenttile = currenttile;
	}
	
	public void setBalance(int balance) {
		account.setBalance(balance);
	}
	
	public int getBalance() {
		return account.getBalance();
	}
	
	public void addBalance(int balance){
		account.addBalance(balance);
	}
	
	public void depositBalance(int add) {
		account.addBalance(add);
	}
	public void withdrawBalance(int add) {
		account.addBalance(-add);
	}
	
	
}


