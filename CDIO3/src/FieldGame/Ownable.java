package FieldGame;

public abstract class Ownable extends Field {
	int price;
	Player owner;
	
	public Ownable() {
		super();
		price = 0;
		owner = new Player();
	}
	public int getRent() {
		
	}

}
