public class HashScript {
	public static void man(String[] args) {
	System.out.println("Give me a string and I will calculate its hash code: ");
	String str = System.console().readLine();
	int hash = str.hashCode();
	int smallHash = HashUtilities.shortHash(hash);
	System.out.println("0 < " + smallHash + " < 1000");
	}
}