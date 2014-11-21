package test;

import fieldgame.Player;
import static org.junit.Assert.*;
import org.junit.Test;

public class Test_AccountDeath {

	// Preconditions
		Player player = new Player();
		
	// Test	
	@Test
		public void test() {
		
		//Ser på balancen før vi starter.
		System.out.println(player.getBalance());
		
		//Fjerner 30000 fra pengebeholdning, da man starter med 30.000
		player.addBalance(-30000);
		
	//Postconditions
		assertEquals(player.CheckDeath(),true);
		//Bruger JUnit til at udføre test case
	}

}
