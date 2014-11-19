package fieldgame;

public class Laborcamp extends Ownable {
	Dicebox box = new Dicebox();
	private int baserent;
	
	public Laborcamp() {
		super();
	}
	public Laborcamp(String name, int price){
		super(name, price);
	}
	@Override
	public int getRent() {
		int rent = baserent * box.getSum();
		return rent;
	}
	public void setBaserent(int baserent) {
		this.baserent = baserent;
	}
	@Override
	public String toString() {
		return name+": Type[Laborcamp] [baserent=" + baserent + "]";
	}
	
}
