package Other;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeDivisorsTest {


	@Test (expected = NullPointerException.class)
	public void testforNullInput() {
		PrimeDivisorList test = new PrimeDivisorList();
		test.add(null);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testforNonPrime_Even() {
		PrimeDivisorList test = new PrimeDivisorList();
		test.add(6);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testforNonPrime_Odd() {
		PrimeDivisorList test = new PrimeDivisorList();
		test.add(15);
	}
	
	@Test
	public void testAdd() {
		PrimeDivisorList test = new PrimeDivisorList();
		Integer expected = 13;
		test.add(expected);
		Integer output = test.primes.get(0);
		assertEquals(expected, output);
	}
}
