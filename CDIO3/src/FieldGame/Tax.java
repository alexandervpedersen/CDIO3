package FieldGame;

public class Tax {
	private int taxAmmount;
	private int taxRate = -1;
	
	public Tax() {
		super();
	}
	public Tax(int taxAmmount) {
		this.taxAmmount = taxAmmount;
	}
	public int getTaxAmmount() {
		return taxAmmount;
	}
	public void setTaxAmmount(int taxAmmount) {
		this.taxAmmount = taxAmmount;
	}
	public int getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}
	

}
