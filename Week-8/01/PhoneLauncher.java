public class PhoneLauncher {
	public static void main(String [] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		SmartPhone mySmartPhone = new SmartPhone();
		for(int i = 0; i<5; i++) {
		mySmartPhone.call("01516326147");
		mySmartPhone.call("01392648794");
		}
		
		mySmartPhone.playGame("Snake");	
	
	}
}
