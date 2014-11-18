package FieldGame;

public abstract class Ownable extends Field {
	private int price;
	private Player owner;
	private boolean isowned = false;
	boolean willing = false;
	
	public Ownable() {
		super();
		price = 0;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void buyField(Player owner) {
		if (willing) {
		this.owner = owner;
		isowned = true;
		this.owner.withdrawBalance(price);
		}
			
	}
	public String getOwner() {
		return owner.getName();
	}
	
	public void setWilling(boolean wantbuy) {
		willing = wantbuy;
	}
	public boolean getWilling() {
		return willing;
	}
	public void resetWilling() {
		willing = false;
	}
	
	@Override
	// setWilling skal laves inden denne metode
	public void LandOnField(Player player) {
		if (isowned == true) {
			player.withdrawBalance(getRent());
			owner.depositBalance(getRent());
		}
		else {
			buyField(player);
			resetWilling();
		}
	}
	
	public abstract int getRent();
		
	public boolean isOwned() {
		return isowned;	
	}
}
