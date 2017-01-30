public class McCarthy {
/**
 * Calculate the result of calling this method with arguments 50, 73, and 95. Note that the recursion on line 5 is
 * double.
 * the result for every input is 91
 */
  public int mcCarthy91(int n) {
    if (n > 100) {
      return n - 10;
    } else {
      return mcCarthy91(mcCarthy91(n+11));
    }
  }
  
  public static void main(String[] args) {

	  McCarthy testing = new McCarthy();
	  System.out.println(testing.mcCarthy91(50));
	  System.out.println(testing.mcCarthy91(73));
	  System.out.println(testing.mcCarthy91(95));
  }
}