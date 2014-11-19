package FieldGame;

public class Refuge extends Field {
	private int bonus;
	
	public Refuge(){
		super();
	}
	
	public Refuge(int bonus){
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void LandOnField(Player player) {
		player.addBalance(bonus);
	}
	

}
