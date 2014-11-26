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
	public boolean checkWinner(int playernumber, Player[] players) {
		int numofplayers=players.length;
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
				for (int o=0; o<players.length; o++) {
					players[o].CheckDeath();
					if (checkAlive(players[o])==false)
						GUIC.removePlayer(players[o]);
				}
				if (checkAlive(players[i]) == true) {
				runTurn(players[i]);
				}
				if (checkWinner(i, players))
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
