package FieldGame;

public class GameBoard {
	Field board[] = new Field[22];
	
	public GameBoard() {
		board[0] = new Start();
		board[1] = new Territory("Tribe Encampment", 100, 1000);
		board[2] = new Territory("Crater", 300, 1500);
		board[3] = new Territory("Mountain", 500, 2000);
		board[4] = new Territory("Cold Desert", 700, 3000);
		board[5] = new Territory("Black Cave", 1000, 4000);
		board[6] = new Territory("The Werewall", 1300, 4300);
		board[7] = new Territory("Mountain Village", 1600, 4750);
		board[8] = new Territory("South Citadel", 2000, 5000);
		board[9] = new Territory("Palace Gates", 2600, 5500);
		board[10] = new Territory("Tower", 3200, 6000);
		board[11] = new Territory("Castle", 4000, 8000);
		board[12] = new Refuge("Walled City", 5000);
		board[13] = new Refuge("Monastary", 500);
		board[14] = new Laborcamp("Huts In The Mountain", 2500);
		board[15] = new Laborcamp("The Pit", 2500);
		board[16] = new Tax("Goldmine", 2000);
		board[17] = new Tax("Caravan", 4000);
		board[18] = new Fleet("Second Sail", 4000);
		board[19] = new Fleet("Sea Grover", 4000);
		board[20] = new Fleet("The Buccaneers", 4000);
		board[21] = new Fleet("Privateer Armade", 4000);
	}

}
