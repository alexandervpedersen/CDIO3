package test;

import static org.junit.Assert.*;
import fieldgame.GameBoard;
import fieldgame.Player;
import org.junit.Test;



public class Test_PayOwnedField { //Fejl i owned, da man bliver spurgt om køb 2 gange.

	//Test case 6, test that field can be purchased.
			@Test
			public void test6(){
			//Preconditions
				// Opretter helholdsvis player og gameboardet, account indholder en balance.
				Player player1 = new Player("TestPerson");
				GameBoard gameboard = new GameBoard();
				
			//Test
				//Simulerer at spilleren lander på feltet 1.
					gameboard.landOnField(5, player1);
			
			//Postconditions
					//Benytter JUnit til at se om de er lig hinanden.
					//Se om 4000 er trukket.
					assertEquals(26000,player1.getBalance());
					//Se på hvor mange fleets jeg ejer:
					assertEquals(1,player1.getFleetammount());
			}
	
			//Test case 7, test of landing on owned field.	
			@Test
			public void test7(){
			//Preconditions
				// Opretter helholdsvis player og gameboardet, account indholder en balance.
				Player player1 = new Player("TestPerson1");
				Player player2 = new Player("TestPerson2");
				GameBoard gameboard = new GameBoard();
				
			//Test
				//Simulerer at spilleren lander på feltet 1.
					gameboard.landOnField(5, player1);
					gameboard.landOnField(5, player2);
			
			//Postconditions
				assertEquals(1,player1.getFleetammount());
				assertEquals(1,player2.getBalance());
				assertEquals(1,player2.getFleetammount());
				System.out.println(player2.getBalance());
			}

}
