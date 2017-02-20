public class Increaser implements Runnable {
	private Counter c;
	
	public Increaser(Counter counter) {
		this.c = counter;
	}
	
	public static void main(String args[]) {
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);
			t.start();
		}
	}

	public void run() {
		System.out.println("Starting at " + c.getCount());
		for (int i = 0; i < 1000; i++) {
			c.increase();
		}
		System.out.println("Stopping at " + c.getCount());
	}
}

//End result changes with every compile if the Counter methods are not synchronized
//End result becomes consistent only if both Counter methods are synchronized

