public class BookImpl implements Book {
  private final String author;
  private final String title;
  private boolean available;
  
  /**
    * Constructs BookImpl
	*/
  public BookImpl(String title, String author) {
	  this.title = title;
	  this.author = author;
	  this.available = true;
  }

  @Override
  public String getAuthor() {
	  return author;
  }

  @Override
  public String getTitle() {
	  return title;
  }
  
  public void bookBorrowed() {
	  available = false;
  }
  
  public void bookReturned() {
	  available = true;
  }
  
  @Override
  public boolean bookAvailable() {
	  return available;
  }
  
}