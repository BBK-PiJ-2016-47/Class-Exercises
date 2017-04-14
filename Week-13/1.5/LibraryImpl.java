public class LibraryImpl implements Library {
	private String libName;

	public LibraryImpl(String name) {
		this.libName = name;
	}
	
  public String getLibName() {
	  return libName;
  }

  @Override
  public int getID() {
    return 10;
  }
  
  public int getID(String name) {
    return 47;
  }

  @Override
  public int getMaxBooksPerUser() {
	// TODO Auto-generated method stub
	return 0;
  }
  


}