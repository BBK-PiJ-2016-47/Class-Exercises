import org.junit.*; 
import static org.junit.Assert.*;

public class LibrariesTest {

	//@Before
	//public void buildUp() {
		Users Bob = new UsersImpl("Bob");
		LibraryImpl newLib = new LibraryImpl("Library Name");
		int x = Bob.register(newLib);
		int id = Bob.getLibraryID();
		String lib = Bob.getLibrary();
		Book ToC = new BookImpl("Theory of Computing", "Kinber");
	//}
	
	
	@Test
	public void testsGetName() {
		String output = Bob.getName();
		String expected = "Bob";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetLibraryID() {
		int output = id;
		int expected = 10;
		assertEquals(expected, output);
	}
	
	@Test
	public void getIdFromName() {
		int output = newLib.getID("Bob");
		int expected = 47;
		assertEquals(expected, output);
	}
	@Test
	public void testsRegister() {
		int output = x;
		int expected = 10;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetLibrary() {
		String output = lib;
		String expected = "Library Name";
		assertEquals(expected, output);
	}
	
	@Test
	public void maxBooks() {
		int output = newLib.getMaxBooksPerUser();
		assertEquals(0, output);
	}
	
	@Test
	public void addBook() {
		Book added = newLib.addBook("Title", "author");
		String author = added.getAuthor();
		assertEquals("author", author);
		String title = added.getTitle();
		assertEquals("Title", title);
		boolean available = added.bookAvailable();
		assertTrue(available);
	}
	
	@Test
	public void takeBook_NotNull() {
		Book output = newLib.takeBook("Theory of Computing");
		assertFalse(output.bookAvailable());
	}
	
	@Test 
	public void takeBook_Null() {
		Book output = newLib.takeBook(null);
		assertEquals(null, output);
	}
	
	@Test
	public void returnBook() {
		Book output = newLib.takeBook("Theory of Computing");
		assertFalse(output.bookAvailable());
		newLib.returnBook(output);
		assertTrue(output.bookAvailable());
	}

}