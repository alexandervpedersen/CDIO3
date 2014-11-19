package FieldGame;

public class Territory extends Ownable {
	private int rent;
	
	public Territory() {
		super();
	}
	public Territory(int price) {
		super(price);
	}
	@Override
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
}
