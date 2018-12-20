import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDie {

	@Test
	public void RollSaad()
	{
		Die Saad = new Die();
		
		for (int i=0; i < 1000; i++)
		{
			Saad.roll();
			assertTrue(Saad.getLastRoll() >= 1 && Saad.getLastRoll() <= 6);
		}
	}

}

