public class CountDown implements Runnable {
	private int task;
	private int seconds;

	public CountDown(int task, int seconds) {
		this.task = task;
		this.seconds = seconds;
	}
	

	public void run() {
		try {
			Thread.sleep(seconds)
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}