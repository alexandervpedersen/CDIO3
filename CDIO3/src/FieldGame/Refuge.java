package FieldGame;

public class Refuge extends Field {
	private int bonus;
	
	public Refuge(){
		super();
	}
	
	public Refuge(String name, int bonus){
		super(name);
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

	@Override
	public String toString() {
		return name+": Type[Refuge] [bonus=" + bonus + "]";
	}
	

}
