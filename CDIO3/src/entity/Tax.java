package entity;


public class Tax extends Field{
	private int taxAmmount;
	private boolean buyit;
	
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
	public void landOnField(Player player) {
			if (buyit){
			int i = player.getBalance() / 10;
			player.addBalance(-i);
			setBuy(false);
			}
			else
			player.addBalance(-taxAmmount);
			}
		
	@Override
	public int getRent() {
		return 0;
	}
	@Override
	public String toString() {
		return name+": Type[Tax] [taxAmmount=" + taxAmmount + "]";
	}
	public boolean getBuy() {
		return buyit;
	}
	public void setBuy(boolean buyit) {
		this.buyit = buyit;
	}
	

}
