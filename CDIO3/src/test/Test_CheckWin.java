package test;
import fieldgame.Player;
import control.GameController;
import static org.junit.Assert.*;
import org.junit.Test;
public class Test_CheckWin {

	// Preconditions	
		GameController gamecontroller = new GameController();
		Player playerarray[] = new Player[3];
		
	// Test	
	@Test
		public void test() {
		//Opretter mine spillere i et array.
		playerarray[0] = new Player("player1");
		playerarray[1] = new Player("player2");
		playerarray[2] = new Player("player3");
		
		//Fjerner 30000 fra pengebeholdning, da man starter med 30.000
		playerarray[0].addBalance(-32000);
		playerarray[1].addBalance(-33000);
		
		System.out.println(playerarray[0].getBalance());
		
		// Kander min public void som til at tjekke efter døde.
		playerarray[0].CheckDeath();
		playerarray[1].CheckDeath();
		
	//Postconditions
		assertEquals(false,playerarray[0].getAlive());
		assertEquals(false,playerarray[1].getAlive());
		assertEquals(true,playerarray[2].getAlive());
		
		
	}

}