package test;
import entity.GameBoard;
import entity.Player;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_LandOnField {

//Test case 1, lands on field 17.
	@Test
	public void test1(){
	//Preconditions
		// Opretter helholdsvis player og gameboardet, account indholder en balance.
		Player player = new Player("TestPerson");
		GameBoard gameboard = new GameBoard();
		
	//Test
		//Simulerer at spilleren lander på feltet 17.
			gameboard.landOnField(17, player);
			System.out.println();
			
	//Postconditions
			//Benytter JUnit til at se om de er lig hinanden, da 5000 bliver tilført på beholdning ved at lande på 17.
			assertEquals(35000,player.getBalance());
	}

//Test case 2, lands on field 4.
	@Test
	public void test2(){
	//Preconditions
		// Opretter helholdsvis player og gameboardet, account indholder en balance.
		Player player = new Player("TestPerson");
		GameBoard gameboard = new GameBoard();
		
	//Test
		//Simulerer at spilleren lander på feltet 4.
			// gameboarder 'køber' for at aktiverer 10% lejen fra feltet
			gameboard.buy(4);
			gameboard.landOnField(4, player);
	
	//Postconditions
			//Benytter JUnit til at se om de er lig hinanden.
			//Test 10%
			assertEquals(27000,player.getBalance());
	}
	
	//Test case 3, lands on field 4.
		@Test
		public void test3(){
		//Preconditions
			// Opretter helholdsvis player og gameboardet, account indholder en balance.
			Player player = new Player("TestPerson");
			GameBoard gameboard = new GameBoard();
			
		//Test
			//Simulerer at spilleren lander på feltet 4.
				gameboard.landOnField(4, player);
		
		//Postconditions
				//Benytter JUnit til at se om de er lig hinanden.
				//Test 4000
				assertEquals(26000,player.getBalance());
		}
		
		//Test case 4, lands on field 19.
		@Test
		public void test4(){
		//Preconditions
			// Opretter helholdsvis player og gameboardet, account indholder en balance.
			Player player = new Player("TestPerson");
			GameBoard gameboard = new GameBoard();
			
		//Test
			//Simulerer at spilleren lander på feltet 19.
				gameboard.landOnField(19, player);
		
		//Postconditions
				//Benytter JUnit til at se om de er lig hinanden.
				//Test 2000
				assertEquals(28000,player.getBalance());
		}
}
