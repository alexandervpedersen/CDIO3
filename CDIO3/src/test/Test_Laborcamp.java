package test;

import entity.Player;
import entity.Laborcamp;
import entity.Dicebox;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Laborcamp {
	Laborcamp lab = new Laborcamp("Fleet1", 2500);
	Player player1 = new Player("Player1");
	Player player2 = new Player("Player2");
	Dicebox box = new Dicebox();
	
	@Test
	public void test() {
		// This testcase tests the rent method from the Laborcamp class
		
		// Tests the player accounts precondition
		assertEquals(30000,player1.getBalance());
		assertEquals(30000,player2.getBalance());
		
		// Simulate a purchase
		lab.setBuy(true);
		lab.landOnField(player1);
		assertEquals(player1,lab.getOwner());
		assertEquals(27500,player1.getBalance());
		assertEquals(true, lab.isOwned());
		
		// simulates a throw 
		box.setDice(0, 5);
		box.setDice(1, 5);
		
		// checks the rent feedback
		assertEquals(1000, lab.getRent(box.getSum()));
		
		// Simulates rent
		lab.landOnField(player2);
		assertEquals(29000,player2.getBalance());
		assertEquals(28500,player1.getBalance());
		
		
		
		
	}

}
