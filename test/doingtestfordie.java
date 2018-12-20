import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class doingtestfordie {

	@Test
	public void rangeOfLastRoll()
	{
		Die SaadForDie = new Die();
		
		for (int i=0; i < 20; i++)
		{
			SaadForDie.roll();
			assertTrue(SaadForDie.getLastRoll() >= 1 && SaadForDie.getLastRoll() <= 6);
		}
	}
}
