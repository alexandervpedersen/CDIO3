package FieldGame;

public class Tax extends Field{
	private int taxAmmount;
	private boolean willing = false;
	
	public Tax() {
		super();
	}
	public Tax(String name, int taxAmmount) {
		super(name);
		this.taxAmmount = taxAmmount;
	}
	public int getTaxAmmount() {
		return taxAmmount;
	}
	public void setTaxAmmount(int taxAmmount) {
		this.taxAmmount = taxAmmount;
	}

	@Override
	public void LandOnField(Player player) {
		if (willing == false)
			player.addBalance(-taxAmmount);
		else if (willing == true) {
			int i = player.getBalance() / 10;
			player.addBalance(-i);
		}
	}
	@Override
	public int getRent() {
		return 0;
	}
	
	

}
