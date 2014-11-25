package control;
import fieldgame.Player;
import fieldgame.GameBoard;
import fieldgame.Dicebox;

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
			GUIC.addPlayer(players[i]);
		}
	}
	
	public void landOnField(Player player, int fieldnumber) {
		int i = fieldnumber -1;
		if (i!=0 || i!=4 || i!=13 || i!=17 || i!=19) {
			if (board.isOwned(i)==false) {
			boolean buy = GUIC.checkWilling();
			if (buy) {
				board.buy(i);
				GUIC.setOwner(player);
			}
		}
		if (board.isOwned(i) && board.getOwner(i)!=player && board.getOwner(i).getAlive())
				GUIC.printTransaction(board.getName(i), board.getOwner(i), player);
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
	public boolean checkDeath(Player player) {
		player.CheckDeath();
		return player.getAlive();
	}
	public boolean checkWinner(int playernumber, int numofplayers) {
		switch (numofplayers) {
		case 2:
			if (playernumber == 0) {
				if (players[1].getAlive()==false)
					return true;
				else 
					return false;
			}
			else if (playernumber == 1) {
				if (players[0].getAlive()==false)
					return true;
				else
					return false;
			}
			else
				return false;
		case 3:
			if (playernumber == 0) {
				if (players[1].getAlive()==false && players[2].getAlive()==false)
					return true;
				else 
					return false;
			}
			else if (playernumber == 1) {
				if (players[0].getAlive()==false && players[2].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 2) {
				if (players[0].getAlive()==false && players[1].getAlive()==false)
					return true;
				else
					return false;
			}
			else
				return false;
		case 4:
			if (playernumber == 0) {
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false)
					return true;
				else 
					return false;
			}
			else if (playernumber == 1) {
				if (players[0].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 2) {
				if (players[0].getAlive()==false && players[1].getAlive()==false && players[3].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 3) {
				if (players[0].getAlive()==false && players[1].getAlive()==false && players[2].getAlive()==false)
					return true;
				else
					return false;
			}
			else
				return false;
		case 5:
			if (playernumber == 0) {
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false)
					return true;
				else 
					return false;
			}
			else if (playernumber == 1) {
				if (players[0].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 2) {
				if (players[0].getAlive()==false && players[1].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 3) {
				if (players[0].getAlive()==false && players[1].getAlive()==false && players[2].getAlive()==false && players[4].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 4) {
				if (players[0].getAlive()==false && players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false)
					return true;
				else
					return false;
		}
			else
				return false;
		case 6:
			if (playernumber == 0) {
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false)
					return true;
				else 
					return false;
			}
			else if (playernumber == 1) {
				if (players[0].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 2) {
				if (players[0].getAlive()==false && players[1].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 3) {
				if (players[0].getAlive()==false && players[1].getAlive()==false && players[2].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 4) {
				if (players[0].getAlive()==false && players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[5].getAlive()==false)
					return true;
				else
					return false;
			}
			else if (playernumber == 5) {
				if (players[0].getAlive()==false && players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false)
					return true;
				else
					return false;
			}
			else
				return false;
		default:
			return false;
		}
	}
	
	public void runGame() {
		while (run) {
			for (int i=0; i<=players.length-1; i++) {
				if (checkDeath(players[i]) == true) {
				runTurn(players[i]);
				checkWinner(i, players.length);
				}
				
			}
		}
	}
	public void showWinner() {
		for (int i=0; i <= players.length; i++)
		if (players[1].getAlive())
			GUIC.printWinner(players[i]);

	}
}
