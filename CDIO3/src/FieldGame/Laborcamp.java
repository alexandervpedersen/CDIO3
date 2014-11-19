package FieldGame;

public class Laborcamp extends Ownable {
	private int baserent;
	
	public Laborcamp() {
		super();
	}
	public Laborcamp(int price, int baserent){
		super(price);
		this.baserent = baserent;
	}
	@Override
	public int getRent() {
		return baserent;
	}
	public void setBaserent(int baserent) {
		this.baserent = baserent;
	}
}
