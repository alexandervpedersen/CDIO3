package entity;

public class GameBoard {
	Field board[] = new Field[22];
	
	public GameBoard() {
		board[0] = new Start("Start");
		board[1] = new Territory("Tribe Encampment", 100, 1000);
		board[2] = new Territory("Crater", 300, 1500);
		board[3] = new Territory("Mountain", 500, 2000);
		board[4] = new Tax("Caravan", 4000);
		board[5] = new Fleet("Second Sail", 4000);
		board[6] = new Territory("Cold Desert", 700, 3000);
		board[7] = new Territory("Black Cave", 1000, 4000);
		board[8] = new Territory("The Werewall", 1300, 4300);
		board[9] = new Laborcamp("Huts In The Mountain", 2500);
		board[10] = new Fleet("Sea Grover", 4000);
		board[11] = new Territory("Mountain Village", 1600, 4750);
		board[12] = new Territory("South Citadel", 2000, 5000);
		board[13] = new Refuge("Monastary", 500);
		board[14] = new Laborcamp("The Pit", 2500);
		board[15] = new Fleet("The Buccaneers", 4000);
		board[16] = new Territory("Palace Gates", 2600, 5500);
		board[17] = new Refuge("Walled City", 5000);
		board[18] = new Territory("Tower", 3200, 6000);
		board[19] = new Tax("Goldmine", 2000);
		board[20] = new Fleet("Privateer Armade", 4000);
		board[21] = new Territory("Castle", 4000, 8000);
	}
	public void setName(int fieldnumber, String new_name){
		board[fieldnumber].setName(new_name);
	}
	public String getName(int fieldnumber){
		return board[fieldnumber].getName();
	}
	public void landOnField(int fieldnumber, Player player){
		board[fieldnumber].landOnField(player);
	}
	public int getRent(int fieldnumber){
		return board[fieldnumber].getRent();
	}
	public boolean needPayment(int fieldnumber) {
		return board[fieldnumber].isOwned();
	}
	public void passStart(Player player) {
			board[0].passStart(player);
	}
	
	public String toString() {
		String out = "";
		for (int i=1; i<=board.length; i++){
			out += board[i-1].toString()+"\n";
		}
		return out;
	}
	public void buy(int fieldnumber) {
		board[fieldnumber].setBuy(true);
	}
	public Player getOwner(int fieldnumber) {
		return board[fieldnumber].getOwner();
		
	}
	public boolean isOwned(int fieldnumber) {
		return board[fieldnumber].isOwned();
	}
	



}
