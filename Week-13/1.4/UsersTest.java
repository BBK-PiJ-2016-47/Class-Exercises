import org.junit.*; 
import static org.junit.Assert.*;

public class UsersTest {

	//@Before
	//public void buildUp() {
		Users Bob = new UsersImpl("Bob");
		Library newLib = new Library();
		int x = Bob.register(newLib);
		int id = Bob.getLibraryID();
		String lib = Bob.getLibrary();
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

}