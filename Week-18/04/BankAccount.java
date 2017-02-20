public class BankAccount {
	private int balance = 0;
	
	//could return incorrect balance
	public synchronized int getBalance() {
		return balance;
	}
	
	//could return balance into a different user's account
	public synchronized void deposit(int money) {
		balance = balance + money;
	}

	//could have problems retrieving money if money has been deposited recently
	public synchronized int retrieve(int money) {
		int result = 0;
		if (balance > money) {
			result = money;
		} else {
			result = balance;
		}

		balance = balance - result;
		return result;
	}
}
