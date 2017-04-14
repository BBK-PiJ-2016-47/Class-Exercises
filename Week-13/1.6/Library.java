public interface Library {

/**
 * returns library name
 */
String getLibName();

/**
 * generates user ID
 */

int getID();

/**
 * gets maximum amount of books each user can borrow
 */

int getMaxBooksPerUser();
/**
 * Adds a new book to the list of books in this library.
 * @param title
 * @param author
 */

Book addBook(String title, String author); 

/**If the book is not taken, marks the book as taken and returns it. If the book is taken or
does not exist, null is returned.
 * 
 * @param title
 */
Book takeBook(String title);

/**
 * Marks the book as not taken.
 * @param book
 */
void returnBook(Book book);
}