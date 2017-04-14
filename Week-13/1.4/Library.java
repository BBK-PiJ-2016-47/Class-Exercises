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

}