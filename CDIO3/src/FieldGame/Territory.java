package FieldGame;

public class Territory extends Ownable {
	private int rent;
	
	public Territory() {
		super();
	}
	@Override
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
}
