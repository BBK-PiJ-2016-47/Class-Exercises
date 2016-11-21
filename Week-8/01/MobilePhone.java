public class MobilePhone extends OldPhone {
	private int called = 1;
	private String[] lastNumbersCalled = new String[10];
	
	@Override
	public void call(String number){
		super.call(number);
		lastNumbersCalled[called-1] = number;
		if (called <= 10) {
			called++;
		} else {
			called = 0;
			
		}
		
		
	}

	public void ringAlarm(String alarm){
		System.out.println("The alarm is set for " + alarm);
	}

	public void playGame(String game) {
		System.out.println("Opening game: " + game);
	}

	public void printLastNumbers() {
		for (int i = 0; i<10; i++) {
			System.out.println(lastNumbersCalled[called - i]);
		}
		
	}
}
