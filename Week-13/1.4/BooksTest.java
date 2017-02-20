import org.junit.*; 
import org.junit.Assert.*;


public class BooksTest {

	Book newBook = new BookImpl("Narnia", "Lewis");

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

}