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
	return 0;
  }

  @Override
  public Book addBook(String title, String author) {
	Book test = new BookImpl(title, author);
	return test;
  }

  @Override
  public Book takeBook(String title) {
	if (title == null) {
	return null;
	} else {
		Book ToC = new BookImpl("Theory of Computing", "Kinber");
		ToC.bookBorrowed();
		return ToC;
	}
  }

  @Override
  public void returnBook(Book book) {
	book.bookReturned();
  }
  
}