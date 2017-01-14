import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {

	@Test
	public void hashHighRange() {
		HashUtilities utility = new HashUtilities();
		for (int i = 0; i < 2000; i++) {
			int hash = utility.shortHash(i);
			assertTrue(hash < 1000);
		}
	}
	
	@Test
	public void hashLowRange() {
		HashUtilities utility = new HashUtilities();
		for (int i = 0; i < 2000; i++) {
			int hash = utility.shortHash(i);
			assertTrue(hash > -1);
		}
	}

}
