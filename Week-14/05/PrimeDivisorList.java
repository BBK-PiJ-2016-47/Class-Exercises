package Other;

import java.util.LinkedList;
import java.util.List;

public class PrimeDivisorList {
	
	List<Integer> primes = new LinkedList<Integer>();
	
	public void add(Integer prime) {
		if (prime == null) {
			throw new NullPointerException();
		}
		if (!isPrime(prime)) {
			throw new IllegalArgumentException();
		}
		primes.add(prime);
		
	}
	
	public boolean isPrime(Integer prime) {
		if (prime % 2 == 0) {
			return false;
		}
		for (int i = 3; i < 10; i+=2) {
			if (prime % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String result = "";
		int size = primes.size();
		int sum = 1;
		for (int i = 0; i < size-1; i++) {
			result += primes.get(i) + " * ";
			sum = primes.get(i) * sum;
		}
		sum = primes.get(size-1) * sum;
		result += primes.get(size-1) + " = " + sum;
		System.out.println(result);
		return result;		
	}
	
	public static void main(String[] args) {
		
		PrimeDivisorList test = new PrimeDivisorList();
		Integer x = 11;
		Integer y = 13;
		Integer z = 22;
		Integer f = 23;
		test.add(x);
		test.add(y);
		//test.add(z);
		test.add(f);
		test.toString();
	}
}
