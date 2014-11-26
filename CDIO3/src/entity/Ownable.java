package entity;

public abstract class Ownable extends Field {
	protected int price;
	protected Player owner;
	protected boolean isowned = false;
	protected boolean buyit;
	
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
			if (owner.getAlive() == true)
			owner.addBalance(getRent());
		}
		else if (buyit){
			buyField(player);
			buyit = false;
		}
	}
	
	public abstract int getRent();
	
	@Override
	public boolean isOwned() {
		return isowned;	
	}
	public void landOnField(Player player, int boxsum) {
	}
	public boolean getBuy() {
		return buyit;
	}
	public void setBuy(boolean buyit) {
		this.buyit = buyit;
	}
}
