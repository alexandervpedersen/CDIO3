package test;
import entity.Player;
import static org.junit.Assert.*;

import org.junit.Test;


public class Test_PastStart {

	//Test case 5, past start.
	@Test
	public void test5(){
		//Preconditions
			// Opretter helholdsvis player og gameboardet, account indholder en balance.
			Player player = new Player("TestPerson");
			
		//Test
			//Simulerer at spilleren slår 12, 2 gange.
			player.movePlayer(12);
			player.movePlayer(12);
		
		//Postconditions
			//Spilleren burde nu være på feltet 3, da han jo stod på tile 1 og nu slog 24.
			assertEquals(3,player.getCurrentfield());
	}

}
