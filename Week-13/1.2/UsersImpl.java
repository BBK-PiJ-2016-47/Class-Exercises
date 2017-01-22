public class UsersImpl implements Users {
	private String name;
	private int libraryID;

  /**
    * Constructs User
	*/
	
	public UsersImpl(String name) {
		this.name = name;
	}
  /**
    * Gets name
	*/
	public String getName() {
		return name;
	}
  /**
    * Gets Library ID
	*/	
	public int getLibraryID() {
		return libraryID;
	}
	
}