public class SmartPhone extends MobilePhone {
	public void browseWeb(String url) {
		System.out.println("Opening webpage " + url);
	}
	
	public String findPosition() {
		System.out.println("You are here!");
		return "You are here!";
	}
	
}
