package fieldgame;

import boundaryToMatador.GUI;

public class Laborcamp extends Ownable {
	private int baserent;
	
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
	public void landOnField(Player player, int boxsum) {
		if (isowned == true) {
			player.addBalance(-getRent(boxsum));
			owner.addBalance(getRent(boxsum));
		}
		else if (GUI.getUserLeftButtonPressed("This tile is not owned, do you want to buy it?", "YES", "NO")){
			buyField(player);
		}
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
