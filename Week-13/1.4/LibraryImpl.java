public class LibraryImpl implements Library {
  private String libName;

  public LibraryImpl(String name) {
    this.libName = name;
  }
	
  public String getLibName() {
	  return libName;
  }


  public int getID() {
    return 10;
  }

  @Override
  public int getMaxBooksPerUser() {
	// TODO Auto-generated method stub
	return 0;
  }
}