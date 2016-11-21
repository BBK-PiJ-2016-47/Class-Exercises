/*Overriding
Save money by routing your international calls through the internet! Modify your class SmartPhone from 01 so that it
overrides the method call(String) inherited from OldPhone. If the string parameter starts with “00”, the method
should output “Calling <number> through the internet to save money”; otherwise, the method should do the same
as the original method.*/

public class SmartPhone extends MobilePhone {
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
	
