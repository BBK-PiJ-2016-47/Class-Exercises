public class NumbersCalled {
	private int number;
	private NumbersCalled nextNumberCalled;
	
	public NumbersCalled(int number) {
		this.number = number;
		this.nextNumberCalled = null;
	}
	
	public NumbersCalled getNextNumberCalled() {
		return this.nextNumberCalled;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNextNumberCalled(NumbersCalled number) {
		this.nextNumberCalled = number;
	}
	
	
}
