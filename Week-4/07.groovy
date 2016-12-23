class Mortgage {
	double borrowed
	int yearsToPay
	double interestRate
	
	Mortgage(double borrowed, int yearsToPay, double interestRate) {
		this.borrowed = borrowed
		this.yearsToPay = yearsToPay
		this.interestRate = interestRate
	}
	
	double totalToPay() {
		double total = borrowed * (1 + (interestRate/100))
		return total;
	}
	
	int annualPayment() {
		double toPay = totalToPay;
		double annualBill = (totalToPay / yearsToPay)
		return annualBill
	}
	
	/* int yearsToPayOffInterest {
	
	} */


}