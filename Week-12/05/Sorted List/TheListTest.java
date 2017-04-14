package sortedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheListTest {

	@Test
	public void testAddItem_Single() {
		TheList test = new TheList();
		test.addItem(5);
		assertEquals(1, test.counter);
		assertEquals(5, test.head.value);
	}
	
	@Test
	public void testAddItem_Multiple() {
		TheList test = new TheList();
		test.addItem(3);
		test.addItem(6);
		test.addItem(4);
		test.addItem(1);
		test.addItem(9);
		assertEquals(5, test.counter);
	}
	
	@Test
	public void testSorted() {
		TheList test = new TheList();
		test.addItem(3);
		test.addItem(6);
		test.addItem(4);
		test.addItem(1);
		test.addItem(9);
		assertEquals(1, test.head.value);
		test.head = test.head.next;
		assertEquals(3, test.head.value);
		test.head = test.head.next;
		assertEquals(4, test.head.value);
		test.head = test.head.next;
		assertEquals(6, test.head.value);
		test.head = test.head.next;
		assertEquals(9, test.head.value);
	}
	

}
