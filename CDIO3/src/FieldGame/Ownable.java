package FieldGame;

public abstract class Ownable extends Field {
	protected int price;
	protected Player owner;
	protected boolean isowned = false;
	protected boolean willing = false;
	
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
	protected void buyField(Player player) {
		if (willing) {
		owner = player;
		isowned = true;
		owner.addBalance(-price);
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
	/* setWilling skal laves inden denne metode
	 * 
	 * der skal tjekkes med isOwned inden, - for at simulere spørgsmålet inden det faktisk bliver stilt
	*/
	
	public void LandOnField(Player player) {
		if (isowned == true) {
			player.addBalance(-getRent());
			owner.addBalance(getRent());
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
