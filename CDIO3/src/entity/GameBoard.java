package entity;

public class GameBoard {
	private Field board[] = new Field[22];
	
	public GameBoard() {
		getBoard()[0] = new Start("Start");
		getBoard()[1] = new Territory("Tribe Encampment", 100, 1000);
		getBoard()[2] = new Territory("Crater", 300, 1500);
		getBoard()[3] = new Territory("Mountain", 500, 2000);
		getBoard()[4] = new Tax("Caravan", 4000);
		getBoard()[5] = new Fleet("Second Sail", 4000);
		getBoard()[6] = new Territory("Cold Desert", 700, 3000);
		getBoard()[7] = new Territory("Black Cave", 1000, 4000);
		getBoard()[8] = new Territory("The Werewall", 1300, 4300);
		getBoard()[9] = new Laborcamp("Huts In The Mountain", 2500);
		getBoard()[10] = new Fleet("Sea Grover", 4000);
		getBoard()[11] = new Territory("Mountain Village", 1600, 4750);
		getBoard()[12] = new Territory("South Citadel", 2000, 5000);
		getBoard()[13] = new Refuge("Monastary", 500);
		getBoard()[14] = new Laborcamp("The Pit", 2500);
		getBoard()[15] = new Fleet("The Buccaneers", 4000);
		getBoard()[16] = new Territory("Palace Gates", 2600, 5500);
		getBoard()[17] = new Refuge("Walled City", 5000);
		getBoard()[18] = new Territory("Tower", 3200, 6000);
		getBoard()[19] = new Tax("Goldmine", 2000);
		getBoard()[20] = new Fleet("Privateer Armade", 4000);
		getBoard()[21] = new Territory("Castle", 4000, 8000);
	}
	public void setName(int fieldnumber, String new_name){
		getBoard()[fieldnumber].setName(new_name);
	}
	public String getName(int fieldnumber){
		return getBoard()[fieldnumber].getName();
	}
	public void landOnField(int fieldnumber, Player player, int dicesum){
		getBoard()[fieldnumber].landOnField(player);
		//Her bliver terningsum sendt ned i landOnField, hvis det er en laborcamp
				if(fieldnumber == 9 || fieldnumber == 14)
					getBoard()[fieldnumber].landOnField(player, dicesum);
				else
					getBoard()[fieldnumber].landOnField(player);
				
	}
	public int getRent(int fieldnumber){
		return getBoard()[fieldnumber].getRent();
	}
	public boolean needPayment(int fieldnumber) {
		return getBoard()[fieldnumber].isOwned();
	}
	public void passStart(Player player) {
			getBoard()[0].passStart(player);
	}
	
	public String toString() {
		String out = "";
		for (int i=1; i<=getBoard().length; i++){
			out += getBoard()[i-1].toString()+"\n";
		}
		return out;
	}
	public void buy(int fieldnumber) {
		getBoard()[fieldnumber].setBuy(true);
	}
	public Player getOwner(int fieldnumber) {
		return getBoard()[fieldnumber].getOwner();
		
	}
	public boolean isOwned(int fieldnumber) {
		return getBoard()[fieldnumber].isOwned();
	}
	public Field[] getBoard() {
		return board;
	}
	public void setBoard(Field board[]) {
		this.board = board;
	}
	



}
