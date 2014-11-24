package test;

import static org.junit.Assert.*;
import fieldgame.GameBoard;
import fieldgame.Player;
import org.junit.Test;



public class Test_PayOwnedField {

	//Test case 6, lands on owned field with fleets.
			@Test
			public void test3(){
			//Preconditions
				// Opretter helholdsvis player og gameboardet, account indholder en balance.
				Player player1 = new Player("TestPerson");
				Player player2 = new Player("TestPerson2");
				GameBoard gameboard = new GameBoard();
				
			//Test
				//Simulerer at spilleren lander på feltet 1.
					gameboard.landOnField(5, player1);
			
			//Postconditions
					//Benytter JUnit til at se om de er lig hinanden.
					//Test 4000
					assertEquals(26000,player1.getBalance());
			}

}
