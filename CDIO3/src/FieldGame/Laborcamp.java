package FieldGame;

public class Laborcamp extends Ownable {
	int baserent;
	
	public Laborcamp() {
		super();
	}
	@Override
	public int getRent() {
		return baserent;
	}
	public void setBaserent(int baserent) {
		this.baserent = baserent;
	}
}
