package FieldGame;

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
	public abstract void LandOnField(Player player);
}
