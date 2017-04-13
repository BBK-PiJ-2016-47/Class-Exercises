import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonQueueTest {
	

		PersonQueue test = new PersonQueueMock();
	

	@Test
	public void testInsertAndRetrieve_OnePerson() {
		Person rick = new Person("Rick", 18.40);
		test.insert(rick);
		Person result = test.retrieve();
		assertEquals(rick, result);
	}
	
	@Test
	public void testInsertAndRetrieve_Multiples() {
		Person rick = new Person("Rick", 18.40);
		Person morty = new Person("Morty", 12.80);
		Person summer = new Person("Summer", 47.29);
		test.insert(rick);
		test.insert(morty);
		test.insert(summer);
		Person result = test.retrieve();
		assertEquals(rick, result);
		Person result2 = test.retrieve();
		assertEquals(morty, result2);
		Person result3 = test.retrieve();
		assertEquals(summer, result3);
	}

}
