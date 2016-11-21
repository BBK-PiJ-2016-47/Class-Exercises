public class MobilePhone extends OldPhone {
	private NumbersCalled lastNumberCalled = null;
	

	public void ringAlarm(String alarm){
		System.out.println("The alarm is set for " + alarm);
	}

	public void playGame(String game) {
		System.out.println("Opening game: " + game);
	}

	public void printLastNumbers() {
		NumbersCalled number = lastNumberCalled;
		boolean isFirst = true;
		
		if(lastNumberCalled == null) {
			System.out.println("No numbers have been called!");
			return;
		}
		do{ if(!isFirst) {
			number = number.getNextNumberCalled();
		}
		System.out.println(number.getNumber());
		isFirst = false;	
		
		} while(number.getNextNumberCalled() != null);
		
	}
		
		
		
	public void addNumber(NumbersCalled number) {
		if (lastNumberCalled == null) {
				lastNumberCalled = number;
				return;
			}
			
			number.setNextNumberCalled(lastNumberCalled);
			lastNumberCalled = number;
	}
	
}
