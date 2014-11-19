package FieldGame;

public class Start extends Field {
	private int income = 4000;
	
	public Start() {
		income = 4000;
	}

	@Override
	public void LandOnField(Player player) {
		passStart(player);
	}
	
	public void passStart(Player player) {
		player.addBalance(income);
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	

}
