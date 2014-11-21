package test;
import fieldgame.Player;
import fieldgame.Account;
import fieldgame.GameBoard;
import static org.junit.Assert.*;

import org.junit.Test;

public class LandOnField {

//Test case 1, lands on field 12.
	@Test
	public void test1(){
	//Preconditions
		// Opretter helholdsvis player og gameboardet, account indholder en balance.
		Player player = new Player("TestPerson");
		GameBoard gameboard = new GameBoard();
		
	//Test
		//Simulerer at spilleren lander p� feltet 12.
			gameboard.landOnField(12, player);
	
	//Postconditions
			//Benytter JUnit til at se om de er lig hinanden, da 5000 bliver tilf�rt p� beholdning ved at lande p� 12.
			assertEquals(35000,player.getBalance());
	}

//Test case 2, lands on field 17.
	@Test
	public void test2(){
	//Preconditions
		// Opretter helholdsvis player og gameboardet, account indholder en balance.
		Player player = new Player("TestPerson");
		GameBoard gameboard = new GameBoard();
		
	//Test
		//Simulerer at spilleren lander p� feltet 17.
			gameboard.landOnField(17, player);
	
	//Postconditions
			//Benytter JUnit til at se om de er lig hinanden.
			System.out.println(player.getBalance());
			//Test 10%
			assertEquals(27000,player.getBalance());
	}
	
	//Test case 3, lands on field 17.
		@Test
		public void test3(){
		//Preconditions
			// Opretter helholdsvis player og gameboardet, account indholder en balance.
			Player player = new Player("TestPerson");
			GameBoard gameboard = new GameBoard();
			
		//Test
			//Simulerer at spilleren lander p� feltet 17.
				gameboard.landOnField(17, player);
		
		//Postconditions
				//Benytter JUnit til at se om de er lig hinanden.
				System.out.println(player.getBalance());
				//Test 4000
				assertEquals(26000,player.getBalance());
		}

}
