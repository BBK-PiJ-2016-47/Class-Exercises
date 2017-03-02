

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

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
					ExecutorService e = Executors.newFixedThreadPool(4);
					//Thread t = new Thread(r);
					//t.start();
					e.execute(r);
					e.shutdown();
				}
			}
		}
	}

	//In mode 0 the threads execute in order, and in a different order during each run, in mode 1 out of order