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
	/**
	 * Denne metode bruges kun til LaborCamp og 
	 * er en løsning til at få dicesum ned i feltet
	 * @param player on field
	 * @param sum of dice
	 */
	public abstract void landOnField (Player player, int sum);
	public void passStart(Player player) {
	}
	public void setBuy(boolean b) {
	}
	public Player getOwner() {
		return null;
	}
}
