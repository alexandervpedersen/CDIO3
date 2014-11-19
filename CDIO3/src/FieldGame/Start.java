package FieldGame;

public class Start extends Field {
	private int income = 4000;
	
	public Start() {
		income = 4000;
		
	}
	public Start(String name){
		super(name);
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int getRent() {
		return 0;
	}
	

}
