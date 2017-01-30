public class RecursiveCode {

/**
 *Do you see anything wrong with the following code? How would you fix it?
 *  String doggyMethod(int n) {
 *  String result = doggyMethod(n-3) + n + doggyMethod(n-2);
 *  if (n <= 0) {
 *    return "";
 *  }
 *  return result;
 *}
 *
 * The result being before the if statement means it prints each time 
 * the recursion is called, rather than once at the end when the recursive
 * loop has completed.
 * 
 */
 

  public String doggyMethod(int n) {
    if (n <= 0) {
      return "";
    }
	String result = doggyMethod(n-3) + n + doggyMethod(n-2);
    return result;
  }

  public static void main(String[] args) {
	RecursiveCode testing = new RecursiveCode();
    System.out.println(testing.doggyMethod(10));

  }

}