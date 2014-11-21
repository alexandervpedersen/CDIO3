package control;
import fieldgame.Player;
import fieldgame.GameBoard;
import fieldgame.Dicebox;

public class GameController {
	GUIController GUIC = new GUIController();
	GameBoard board = new GameBoard();
	Dicebox box = new Dicebox();
	Player players[];
	boolean run = true;
	
	public void init(){
		createGame();
		runGame();
	}
	
	public void createGame() {
		int num = GUIC.getNumOfPlayers();
		Player players[] = new Player[num];
		for (int i=1; i<=num; i++){
			players[i-1] = new Player(GUIC.getPlayername(i));
		}
		for (int i=1; i<=num; i++){
			GUIC.addPlayer(players[i-1]);
		}
	}
	
	public void landOnField(Player player, int fieldnumber) {
			if (board.needPayment(fieldnumber-1) == false) {
				if (GUIC.checkWilling()) {
					player.setWilling(true);
					GUIC.setOwner(player, fieldnumber);
				}
				else 
					player.resetWilling();
			}
			board.landOnField(fieldnumber-1, player);
			player.resetWilling();
	}
	
	public void runTurn(Player player) {
		GUIC.throwDice(player);
		box.rollDice();
		GUIC.showDice(box.getDice(0), box.getDice(1));
		player.movePlayer(box.getSum());
		GUIC.movePlayer(player, player.getCurrentfield());
		landOnField(player, player.getCurrentfield());
	}
	public boolean checkDeath(Player player) {
		player.CheckDeath();
		return player.getAlive();
	}
	public boolean checkWinner(int playernumber, int numofplayers) {
		switch (numofplayers) {
		case 2:
			if (playernumber == 1)
				if (players[2].getAlive()==false)
					return true;
				else 
					return false;
			else if (playernumber == 2)
				if (players[1].getAlive()==false)
					return true;
				else
					return false;
			else
				return false;
		case 3:
			if (playernumber == 1)
				if (players[2].getAlive()==false && players[3].getAlive()==false)
					return true;
				else 
					return false;
			else if (playernumber == 2)
				if (players[1].getAlive()==false && players[3].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 3)
				if (players[1].getAlive()==false && players[2].getAlive()==false)
					return true;
				else
					return false;
			else
				return false;
		case 4:
			if (playernumber == 1)
				if (players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false)
					return true;
				else 
					return false;
			else if (playernumber == 2)
				if (players[1].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 3)
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[4].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 4)
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false)
					return true;
				else
					return false;
			else
				return false;
		case 5:
			if (playernumber == 1)
				if (players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false)
					return true;
				else 
					return false;
			else if (playernumber == 2)
				if (players[1].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 3)
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 4)
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[5].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 5)
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false)
					return true;
				else
					return false;
			else
				return false;
		case 6:
			if (playernumber == 1)
				if (players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false && players[6].getAlive()==false)
					return true;
				else 
					return false;
			else if (playernumber == 2)
				if (players[1].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false && players[6].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 3)
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false && players[6].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 4)
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[5].getAlive()==false && players[6].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 5)
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false && players[6].getAlive()==false)
					return true;
				else
					return false;
			else if (playernumber == 6)
				if (players[1].getAlive()==false && players[2].getAlive()==false && players[3].getAlive()==false && players[4].getAlive()==false && players[5].getAlive()==false)
					return true;
				else
					return false;
			else
				return false;
		}
	}
	
	public void runGame() {
		while (run) {
			for (int i=1; i<=players.length; i++) {
				if (checkDeath(players[i]) == true) {
				runTurn(players[i]);
				checkWinner(i, players.length);
				}
				
			}
		}
	}
}
