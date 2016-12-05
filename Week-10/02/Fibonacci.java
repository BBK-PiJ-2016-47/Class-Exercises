public class Fibonacci {

	public static int recursiveFibonacci(int n) {
			if ((n == 1) || (n == 2)) {
				return 1;
			} else {
				int result = recursiveFibonacci(n-1) + recursiveFibonacci(n-2); // method calls itself
				return result;
			}
	}

	public static int iterativeFibonacci(int n) {
		if ((n==1) || (n==2)) {
			System.out.println("The Fibonacci number at " + n + " is 1");
			return 1;
		} else {
			private int firstFib = 1;
			private int secondFib = 1;
			private int result = 0;
			
				for(int x = 3; x <= n; x++) {
					result = firstFib + secondFib;
					firstFib = secondFib;
					secondFib = result;
				}
			System.out.println("The Fibonacci number at " + n + " is " + result);
			return result;
		}
	
	}


	public static void main(String [] args) {
		recursiveFibonacci(2);
		iterativeFibonacci(2);
		recursiveFibonacci(7);
		iterativeFibonacci(10);
	
	}
}
