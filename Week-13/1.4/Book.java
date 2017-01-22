public interface Book {

  /**
    * Constructs BookImpl
	*/
 BookImpl(String title, String author);
   /**
    * Gets author
	*/
 String getAuthor();
  /**
    * Gets title
	*/
  String getTitle();

}