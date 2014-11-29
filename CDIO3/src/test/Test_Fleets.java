package test;
import entity.Fleet;
import entity.Player;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Fleets {
	Fleet fleet1 = new Fleet("Fleet1", 4000);
	Fleet fleet2 = new Fleet("Fleet2", 4000);
	Player player1 = new Player("Player1");
	Player player2 = new Player("Player2");
	@Test
	public void test() {
		// Tests buy/rent for 2 fleet fields 
		
		// Tests the player accounts precondition
		assertEquals(30000,player1.getBalance());
		assertEquals(30000,player2.getBalance());
		
		
		// Simulates 1st purchase
		fleet1.setBuy(true);
		fleet1.landOnField(player1);
		assertEquals(player1,fleet1.getOwner());
		assertEquals(26000,player1.getBalance());
		assertEquals(1,player1.getFleetammount());
		assertEquals(500, fleet1.getRent());
		assertEquals(true, fleet1.isOwned());
		
		// Simulates rent
		fleet1.landOnField(player2);
		assertEquals(29500,player2.getBalance());
		assertEquals(26500,player1.getBalance());
		
		// Simulate 2nd purchase
		fleet2.setBuy(true);
		fleet2.landOnField(player1);
		assertEquals(player1,fleet2.getOwner());
		assertEquals(22500,player1.getBalance());
		assertEquals(2,player1.getFleetammount());
		assertEquals(1000, fleet1.getRent());
		assertEquals(1000, fleet2.getRent());
		assertEquals(true, fleet2.isOwned());
		
		// Simulates rent
		fleet1.landOnField(player2);
		assertEquals(28500,player2.getBalance());
		assertEquals(23500,player1.getBalance());
		
		fleet1.landOnField(player2);
		assertEquals(27500,player2.getBalance());
		assertEquals(24500,player1.getBalance());
		
	}

}
