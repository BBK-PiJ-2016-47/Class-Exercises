public class PhoneLauncher {

	public static void main(String [] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		MobilePhone nokia;
		launcher.testPhone(new MobilePhone("nokia3210"));
	}

	//2.5
	public void testPhone(Phone phone) {
		phone.call("0457288");
		((MobilePhone)phone).playGame("Space Invaders");		
		((SmartPhone)phone).findPosition();
		((SmartPhone)phone).browseWeb("twitter");
		
	}
}
