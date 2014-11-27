package control;
import entity.Dicebox;
import entity.GameBoard;
import entity.Player;

public class GameController {
	GUIController GUIC = new GUIController();
	GameBoard board = new GameBoard();
	Dicebox box = new Dicebox();
	private Player players[];
	boolean run = true;
	
	public void init(){
		createGame();
		runGame();
		showWinner();
	}
	
	public void createGame() {
		GUIC.createPath();
		int num = GUIC.getNumOfPlayers();
		players = new Player[num];
		for (int i=1; i<=num; i++){
			players[i-1] = new Player(GUIC.getPlayername(i));
		}
		for (int i=0; i<=num-1; i++){
			GUIC.addPlayer(players[i], i+1);
		}
	}
	
	public void landOnField(Player player, int fieldnumber) {
		int i = fieldnumber -1;
		if (i!=0 && i!=4 && i!=13 && i!=17 && i!=19) {
			if (board.isOwned(i)==false) {
			boolean buy = GUIC.checkWilling();
			if (buy) {
				board.buy(i);
				GUIC.setOwner(player);
			}
		}
		if (board.isOwned(i) && board.getOwner(i)!=player && board.getOwner(i).getAlive())
			GUIC.printTransaction1(board.getName(i), board.getOwner(i), player);
		if (board.isOwned(i) && board.getOwner(i)!=player && board.getOwner(i).getAlive()==false)
			GUIC.printTransaction2(board.getName(i), board.getOwner(i), player);
		}
			board.landOnField(i, player);
	}
	
	public void runTurn(Player player) {
		GUIC.throwDice(player);
		box.rollDice();
		GUIC.showDice(box.getDice(0), box.getDice(1));
		player.movePlayer(box.getSum());
		GUIC.movePlayer(player);
		landOnField(player, player.getCurrentfield());
		for (int i=0; i<=players.length-1; i++)
		GUIC.updateBalance(players[i]);
	}
	public boolean checkAlive(Player player) {
		player.CheckDeath();
		return player.getAlive();
	}
	public boolean checkWinner(Player[] players) {
		int i =0;
		for(int p=0; p<players.length; p++) {
			if (players[0].getAlive()==false)
				i++;
		}
		if (players.length==i)
			return true;
		else
			return false;
	}
	
	public void runGame() {
		while (run) {
			for (int i=0; i<=players.length-1; i++) {
				for (int o=0; o<players.length; o++) {
					players[o].CheckDeath();
					if (checkAlive(players[o])==false)
						GUIC.removePlayer(players[o]);
				}
				if (checkAlive(players[i]) == true) {
				runTurn(players[i]);
				}
				if (checkWinner(players))
					run = false;
			}
		}
	}
	public void showWinner() {
		for (int i=0; i <= players.length-1; i++)
		if (players[1].getAlive())
			GUIC.printWinner(players[i]);

	}
}
