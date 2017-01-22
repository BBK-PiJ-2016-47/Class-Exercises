public class SmartPhone extends MobilePhone {
	public SmartPhone(String brand) {
		super(brand);
	}
	public void browseWeb(String url) {
		System.out.println("Opening webpage " + url);
	}
	
	public String findPosition() {
		System.out.println("You are here!");
		return "You are here!";
	}
	
	@Override
	public void call(String number) {
		String dialCode = number.substring(0,2);
		if(dialCode.equals("00")) {
			System.out.println("Calling " + number + " through the internet to save money");
		} else {
		super.call(number);
		}
	}
}
	
