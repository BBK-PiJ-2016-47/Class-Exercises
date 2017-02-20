public class TextLoop implements Runnable {
	public static final int COUNT = 10;
		private final String name;
		
		public TextLoop(String name) {
			this.name = name;
		}	
		
		@Override
		public void run() {
			for (int i = 0; i < COUNT; i++) {
				System.out.println("Loop:" + name + ", iteration:" + i + ".");
				sleep();
			}
		}
		
		private void sleep() {
			try {	
				Thread.sleep(1000); // Sleep one second

			} catch (InterruptedException ex) {
				ex.printStackTrace(); // Nothing to do, sleep a bit less
			}
		}

		public static void main(String args[]) {
			if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
				System.out.println("USAGE: java TextLoop <mode>");
				System.out.println(" mode 0: without threads");
				System.out.println(" mode 1: with threads");
			} else if (args[0].equals("0")) {
				System.out.println("Without threads");
				for (int i = 0; i < 10; i++) {
					Runnable r = new TextLoop("Thread " + i);
					r.run();
				}
			} else {
				System.out.println("With threads");
				for (int i = 0; i < 10; i++) {
					Runnable r = new TextLoop("Thread " + i);
					Thread t = new Thread(r);
					t.start();
				}
			}
		}
	}

	//In mode 0 the threads take forever to execute, with threads takes slightly less time to execute
	//Blasts out processes in blocks for mode 1
	//Each process takes one second in mode 0