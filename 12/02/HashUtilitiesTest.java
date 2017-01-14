import org.junit.Test;
import org.junit.Assert;

public class HashUtilitiesTest {
	
	@Test
	public void hashCodeRangeTest {
		HashUtilities utility = new HashUtilities();
		for (int i = 0; i < 2000; i++) {
			int hash = utility.shortHash(i);
			assertTrue(hash > 0 && hash < 1000);
		}
	}

}
