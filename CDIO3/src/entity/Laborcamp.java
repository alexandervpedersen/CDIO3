package entity;

public class Laborcamp extends Ownable {
	private int baserent = 100;
	
	public Laborcamp() {
		super();
	}
	public Laborcamp(String name, int price){
		super(name, price);
	}
	public int getRent(int boxsum) {
		int rent = baserent * boxsum;
		return rent;
	}
	@Override
	/**
	 * Denne metode bruger boxsum i Laborcamp
	 * 
	 */
	public void landOnField(Player player, int boxsum) {
		if (isowned == true) {
			player.addBalance(-getRent(boxsum));
			owner.addBalance(getRent(boxsum));
		}
		else if (buyit){
			buyField(player);
		}
	}
	@Override
	
	public void landOnField(Player player) {
		if (isowned == true) {
			player.addBalance(-getRent());
			owner.addBalance(getRent());
		}
		else if (buyit){
			buyField(player);
		}
	}
	@Override
	public void buyField(Player player) {
		owner = player;
		isowned = true;
		owner.addBalance(-price);
	}
	public void setBaserent(int baserent) {
		this.baserent = baserent;
	}
	@Override
	public String toString() {
		return name+": Type[Laborcamp] [baserent=" + baserent + "]";
	}
	@Override
	public int getRent() {
		return 0;
	}
	
}
