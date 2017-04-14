public interface Book {


   /**
    * Gets author
	*/
 String getAuthor();
  /**
    * Gets title
	*/
  String getTitle();
  
  /**
   * 
   * @return boolean for if book is availble
   */
  boolean bookAvailable();
  
  /**
   * sets boolean for book available to false
   */
  public void bookBorrowed();
  /**
   * sets boolean for book available to true
   */
  
  public void bookReturned();

}