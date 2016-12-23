public class Spy {
	private static int spyCount = 0;
	private int ID;
	
	Spy(int ID){
	this.ID = ID;
	spyCount++;
	System.out.println("The Spy ID is " + ID + " and they are spy #" + spyCount);
	}
	
	public void die() {
		System.out.println("Spy " + this.ID + " has been detected and eliminated.");
		spyCount--;
		System.out.println("There are " + spyCount + " spies left.");
	}
	
	
	public static void main(String[] args) {
		
		Spy Karen = new Spy(123);
		Spy Shayna = new Spy(235);
		Spy Alex = new Spy(347);
		Spy Sarah = new Spy(459);
		
		Alex.die();
		Karen.die();
	}
}