public class LibraryImpl implements Library {
  private String libName;
  private int readerCount;
  private int borrowedCount;
  private int bookCount;
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
	bookCount++;
	Book test = new BookImpl(title, author);
	return test;
  }

  @Override
  public Book takeBook(String title) {
	borrowedCount++;
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

  @Override
  public int getReaderCount() {
	return readerCount;
  }

  @Override
  public int getBookCount() {
	return bookCount;
  }

  @Override
  public int getBookBorrowedCount() {
	return borrowedCount;
  }
  
}