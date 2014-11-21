package control;
import fieldgame.Player;
import fieldgame.GameBoard;
import fieldgame.Dicebox;

public class GameController {
	GUIController GUIC = new GUIController();
	GameBoard board = new GameBoard();
	Dicebox box = new Dicebox();
	
	public void init(){
		createGame();
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
}
