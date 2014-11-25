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
				//Simulerer at spilleren lander på feltet 5.
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
				GameBoard gameboard = new GameBoard();
				Player player1 = new Player("TestPerson1");
				Player player2 = new Player("TestPerson2");
				
			//Test
				//Simulerer at spilleren lander på feltet 5.
					gameboard.landOnField(5, player1);
					gameboard.landOnField(5, player2);
			
			//Postconditions
				//Tjekker at spiller 1 har en fleet.
				assertEquals(1,player1.getFleetammount());
				//Tjekker at spiller 2 har en balance på 29500 efter at have landet på feltet.
				assertEquals(29500,player2.getBalance());
				//Sikrer os at spiller 2 ikke har fået en fleet på feltet.
				assertEquals(0,player2.getFleetammount());
				//Tjekker at spiller 1 har fået penge fra spiller 2 (500).
				assertEquals(26500,player1.getBalance());
			}

}
