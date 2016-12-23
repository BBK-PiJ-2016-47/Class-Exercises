public class Power {
	private int base;
	private int exponent;
	
	Power(int base, int exponent) {
		this.base = base;
		this.exponent = exponent;
	}
	
	public static int powIterative(int base, int exponent) {
		int count = 0;
		int answer = 1;
		while (count < exponent){
			answer = answer*base;
			count++;
		}
		System.out.println(base + " to the power of " + exponent + " is " + answer);
		return answer;		
	}
	
	public static int powRecursive(int base, int exponent) {
		if (exponent == 1) {
			return base;
		} else {
			int answer = base * powRecursive(base, exponent-1);
			return answer;
		}
	}

	public static void main(String[] args) {
		powIterative(2,3);
		int result = powRecursive(2,3);
		System.out.println("2 to the power of 3 recursively is " + result);
	}

}