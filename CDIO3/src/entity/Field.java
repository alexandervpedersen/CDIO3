package entity;

public abstract class Field {
	protected String name;
	
	public Field() {
		super();
	}
	public Field(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void landOnField(Player player);
	public abstract int getRent();
	public boolean isOwned() {
		return false;
	}
	public void passStart(Player player) {
	}
	public void setBuy(boolean b) {
	}
	public Player getOwner() {
		return null;
	}
	public void setBoxsum(int boxvalue) {
	}
}
