package entity;

public class Account {
		
	private int balance = 30000;
	
	public Account() {
	}
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		if (balance < 0)
			balance = 0;
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void addBalance(int add) {
			this.balance = balance + add;
	}
	
	public boolean CheckDeath(){
		if (balance<=0)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return ("current balance: " + getBalance());
	}
}
