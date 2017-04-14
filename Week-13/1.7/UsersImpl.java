public class UsersImpl implements Users {
	private String name;
	private int libraryID;
	private Library lib;
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
	
  /**
    * Registers user at library and returns Library ID
	*/	
	public int register(Library library) {
		int libID = library.getID();
		this.lib = library;
		this.libraryID = libID;
		return libID;
	}
  /**
    * Returns name of library
	*/	
	public String getLibrary() {
		return lib.getLibName();
	}
}