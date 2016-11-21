public class PhoneLauncher {
	public static void main(String [] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		
		//Old phone test
		OldPhone rotary = new OldPhone();
		rotary.call("01516794738");
		
		//Mobile phone test 
		MobilePhone nokia3210 = new MobilePhone();
		nokia3210.call("0747398272");
		nokia3210.ringAlarm("7.30am");
		nokia3210.playGame("Snake");
		nokia3210.printLastNumbers();
		
		//Smart phone test
		SmartPhone htc = new SmartPhone();
		htc.call("0047462");
		htc.call("0164748489");
		htc.browseWeb("google.com");
		htc.findPosition();
		
	
	}
}
