package test;
import entity.Player;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_StartBeholdning {
	//Preconditions
		Player player = new Player();
	
	//Postconditions	
		@Test
		public void test() {
		assertEquals(player.getBalance(),30000);
		}
}
