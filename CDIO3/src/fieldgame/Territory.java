package fieldgame;

import boundaryToMatador.GUI;

public class Territory extends Ownable {
	private int rent;
	boolean buyit = false;
	
	public Territory() {
		super();
	}
	public Territory(String name, int rent, int price) {
		super(name, price);
		this.rent = rent;
	}
	@Override
	public void landOnField(Player player) {
		if (isowned == true) {
			player.addBalance(-getRent());
			owner.addBalance(getRent());
		}
		else if (buyit){
			buyField(player);
			buyit = false;
		}
	}
	@Override
	public void buyField(Player player) {
		owner = player;
		isowned = true;
		owner.addBalance(-price);
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
