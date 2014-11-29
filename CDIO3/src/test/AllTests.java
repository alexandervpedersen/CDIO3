package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test_AccountDeath.class, Test_CheckWin.class,
		Test_Fleets.class, Test_Laborcamp.class, Test_LandOnField.class,
		Test_PastStart.class, Test_PayOwnedField.class,
		Test_StartBeholdning.class })
public class AllTests {

}
