public class Factorials {

//recursive

public static int recursiveFactorial(int n) {
	if(n==1) {
		return 1;
	} else {
		int result = n * recursiveFactorial(n-1);
		return result;
	}
}

//iterative
public static void iterativeFactorial (int n) {
	int multiply = 1;
	int originalNumber = n;
	if (n == 1) {
		System.out.println("The answer is 1");
	}else {
		while (n > 1) {
			multiply = multiply * n;
			n--;
		}
	System.out.println("The factorial of " + originalNumber + " is " + multiply);

	}

}
	public static void main(String [] args) {
		iterativeFactorial(6);
		recursiveFactorial(6);
	}
}
