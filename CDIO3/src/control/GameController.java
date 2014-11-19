package control;
import fieldgame.Account;
import fieldgame.Player;


public class GameController {
	GUIController GUIC = new GUIController();
	
	public void createGame() {
		int num = GUIC.getNumOfPlayers();
		Player players[] = new Player[num];
		for (int i=1; i<=num; i++){
			players[i] = new Player(GUIC.getPlayername(i), new Account());
			GUIC.addPlayer(players[i]);
		}
		
		
	}

}
