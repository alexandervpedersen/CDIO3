package fieldgame;
import boundaryToMatador.GUI;

public class Game {

	public static void main(String[] args) {
		// Antal spillere
		int playerCount;
		String playerNavn;
		//Antal spillere findes
		playerCount = GUI.getUserInteger("Indtast antal spilllere (2-6)");
		while (playerCount < 2 || playerCount > 6){
			if (playerCount < 2) {
				GUI.showMessage("Du har for få spillere");
			}
			else if (playerCount > 6){
				GUI.showMessage("Du har for mange spillere");
			}
			playerCount = GUI.getUserInteger("Indtast antal spilllere 2-6 igen");
	
		}
		//Spillere laves
		for(int i=1; i<playerCount; i++){
			playerNavn = GUI.getUserString("Indtast navn på spiller " + i);
			new Player(playerNavn);
				GUI.addPlayer(playerNavn, 30000);
	}
}
}
