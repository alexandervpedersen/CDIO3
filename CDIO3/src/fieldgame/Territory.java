package fieldgame;

import boundaryToMatador.GUI;

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
	public void landOnField(Player player) {
		if (isowned == true) {
			player.addBalance(-getRent());
			owner.addBalance(getRent());
		}
		else if (GUI.getUserLeftButtonPressed("This tile is not owned, do you want to buy it?", "YES", "NO")){
			buyField(player);
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
