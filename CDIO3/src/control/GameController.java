package control;
import fieldgame.Account;
import fieldgame.Player;


public class GameController {
	GUIController GUIC = new GUIController();
	
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

}
