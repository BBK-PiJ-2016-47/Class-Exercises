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
 * The method is called recursively before the if statement so it has no parameters to make it stop calling
 * so it gets stuck and causes stack overflow
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