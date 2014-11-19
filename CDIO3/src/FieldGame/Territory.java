package FieldGame;

public class Territory extends Ownable {
	private int rent;
	
	public Territory() {
		super();
	}
	public Territory(String name, int rent, int price) {
		super(name, price);
		this.rent = rent;
	}
	@Override
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name+": Type[Territory] [rent=" + rent + "]";
	}
	
	
}
