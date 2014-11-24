package fieldgame;

import boundaryToMatador.GUI;

public abstract class Ownable extends Field {
	protected int price;
	protected Player owner;
	protected boolean isowned = false;
	
	public Ownable() {
		super();
		price = 0;
	}
	public Ownable(String name, int price) {
		super(name);
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	protected void buyField(Player player) {
		owner = player;
		isowned = true;
		owner.addBalance(-price);
	}
	public String getOwnerName() {
		return owner.getName();
	}
	
	public Player getOwner() {
		return owner;
	}
	
	@Override
	/* setWilling skal laves inden denne metode
	 * 
	 * der skal tjekkes med isOwned inden, - for at simulere spørgsmålet inden det faktisk bliver stilt
	*/
	
	public void landOnField(Player player) {
		if (isowned == true) {
			player.addBalance(-getRent());
			owner.addBalance(getRent());
		}
		else if (GUI.getUserLeftButtonPressed("This tile is not owned, do you want to buy it?", "YES", "NO")){
			buyField(player);
		}
	}
	
	public abstract int getRent();
	
	@Override
	public boolean needPayment() {
		return isowned;	
	}
	public void landOnField(Player player, int boxsum) {
	}
}
