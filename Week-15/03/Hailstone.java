public class Hailstone {
  int ans = 0;
  public int hailMethod(int n) {
	if (n == 1) {
	  System.out.println("n has converged to 1: ");
	  return 1;
	}
	while(n != 1) {
      if (n%2==0) {
	    System.out.println("Even number: " + n);
	    ans =  hailMethod(n/2);
	    return ans;
	  } else {
	    System.out.println("Odd number: " + n);
	    int result = (3*n)+1;
	    ans = hailMethod(result);
	    return ans;
	  }
	}
	return 0;
  }
  
  public static void main(String[] args) {
	 Hailstone testing = new Hailstone();
	 System.out.println(testing.hailMethod(10));
	 System.out.println(testing.hailMethod(47));
  }

}