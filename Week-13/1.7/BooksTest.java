import static org.junit.Assert.*;

import org.junit.*; 



public class BooksTest {

	BookImpl newBook = new BookImpl("Narnia", "Lewis");

	@Test
	public void testsGetTitle() {
		String output = newBook.getTitle();
		String expected = "Narnia";
		assertEquals(expected, output);
	}

	@Test
	public void testsGetAuthor() {
		String output = newBook.getAuthor();
		String expected = "Lewis";
		assertEquals(expected, output);
	}
	
	@Test
	public void testAvailable() {
		assertTrue(newBook.bookAvailable());
	}
	
	@Test
	public void bookBorrowing() {
		newBook.bookBorrowed();
		assertFalse(newBook.bookAvailable());
		newBook.bookBorrowed();
		assertTrue(newBook.bookAvailable());
	}
	
	@Test
	public void bookReturning() {
		newBook.bookBorrowed();
		assertFalse(newBook.bookAvailable());
		newBook.bookReturned();
		assertTrue(newBook.bookAvailable());
	}

}