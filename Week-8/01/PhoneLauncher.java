public class PhoneLauncher {
	public static void main(String [] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		SmartPhone mySmartPhone = new SmartPhone();
		mySmartPhone.playGame("Snake");
		
		for(int i = 0; i<10; i++) {
		mySmartPhone.call("01516326147");
		}
		
		mySmartPhone.printLastNumbers();
	}
}
