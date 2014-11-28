package entity;

public class Start extends Field {
	private int income = 0;
	
	public Start() {
		income = 0;
	}
	public Start(String name){
		super(name);
	}

	@Override
	public void landOnField(Player player) {
		passStart(player);
	}
	@Override
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
	@Override
	public String toString() {
		return name+": Type[Start] [income=" + income + "]";
	}
	@Override
	public void landOnField(Player player, int sum) {
		// TODO Auto-generated method stub
		
	}
	

}
