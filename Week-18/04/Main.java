public class Main {

	public static void main(String[] args) {
		
		BankAccount test = new BankAccount();
		
		System.out.println(test.getBalance());
		test.deposit(10);
		System.out.println(test.retrieve(5));
		System.out.println(test.getBalance());
	
	}

}