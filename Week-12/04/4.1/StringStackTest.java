import static org.junit.Assert.*;

import org.junit.Test;

public class StringStackTest {

	@Test
	public void pushAndPop_Single() {
		StringStack test = new StringStackMock();
		test.push("Hello");
		String result = test.pop();
		assertEquals("Hello", result);
	}
	
	@Test
	public void pushAndPop_Multiples() {
		StringStack test = new StringStackMock();
		test.push("Hello");
		test.push("Bonjour");
		test.push("Hola");
		String result = test.pop();
		assertEquals("Hola", result);
		String result2 = test.pop();
		assertEquals("Bonjour", result2);
		String result3 = test.pop();
		assertEquals("Hello", result3);
	}
	
	@Test
	public void pushPopPushPop() {
		StringStack test = new StringStackMock();
		test.push("Hello");
		String result = test.pop();
		assertEquals("Hello", result);
		test.push("Bonjour");
		test.push("Hola");
		String result2 = test.pop();
		assertEquals("Hola", result2);
	}
	
	@Test
	public void singlePushReplace() {
		StringStack test = new StringStackMock();
		test.push("Hello");
		test.push("Hello", "Hola");
		String result = test.pop();
		assertEquals(result, "Hola");
	}
	
	@Test
	public void multiplePushReplace() {
		StringStack test = new StringStackMock();
		test.push("Hello");
		test.push("Bonjour");
		test.push("Hello");
		test.push("Hello");
		test.push("Hello", "Hola");
		String result = test.pop();
		assertEquals(result, "Hola");
		String result2 = test.pop();
		assertEquals(result2, "Hola");
		String result3 = test.pop();
		assertEquals(result3, "Hola");
		String result4 = test.pop();
		assertEquals(result4, "Bonjour");
		String result5 = test.pop();
		assertEquals(result5, "Hola");
	}

}
