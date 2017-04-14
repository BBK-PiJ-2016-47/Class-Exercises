package simplemapproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMapTest {

	@Test
	public void testPutGet_Single() {
		SimpleMap test = new SimpleMapImpl();
		test.put(1, "one");
		String result = test.get(1);
		assertEquals("one", result);
	}
	
	@Test
	public void testPutGet_Multiple() {
		SimpleMap test = new SimpleMapImpl();
		test.put(1, "one");
		test.put(2, "two");
		test.put(3, "three");
		String result = test.get(1);
		assertEquals("one", result);
		String result2 = test.get(2);
		assertEquals("two", result2);
		String result3 = test.get(3);
		assertEquals("three", result3);
	}
	
	@Test
	public void testPutGetPutGet() {
		SimpleMap test = new SimpleMapImpl();
		test.put(1, "one");
		String result = test.get(1);
		assertEquals("one", result);
		test.put(2, "two");
		test.put(3, "three");
		String result2 = test.get(2);
		assertEquals("two", result2);
	}
	
	@Test
	public void testEmptyGet() {
		SimpleMap test = new SimpleMapImpl();
		String result = test.get(1);
		assertEquals(null, result);
	}
	
	@Test
	public void testRemove_ExistingElement() {
		SimpleMap test = new SimpleMapImpl();
		test.put(1, "one");
		test.remove(1);
		boolean empty = test.isEmpty();
		String result = test.get(1);
		assertEquals(null, result);
		assertTrue(empty);
	}
	
	@Test
	public void testRemove_NonExistingElement() {
		SimpleMap test = new SimpleMapImpl();
		test.put(2, "two");
		test.remove(1);
		assertFalse(test.isEmpty());
	}
	
	@Test
	public void repeatKey() {
		SimpleMap test = new SimpleMapImpl();
		test.put(1, "one");
		test.put(1, "repeat");
		String result = test.get(1);
		assertEquals("one", result);
	}
	
	@Test
	public void testRemovePut() {
		SimpleMap test = new SimpleMapImpl();
		test.put(1, "one");
		test.remove(1);
		test.put(1, "two");
		String result = test.get(1);
		assertEquals("two", result);
	}
	
	@Test
	public void testIsEmpty_Empty() {
		SimpleMap test = new SimpleMapImpl();
		boolean result = test.isEmpty();
		assertEquals(true, result);
	}
	
	@Test
	public void testIsEmpty_NonEmpty() {
		SimpleMap test = new SimpleMapImpl();
		test.put(1, "one");
		boolean result = test.isEmpty();
		assertEquals(false, result);
	}

}
