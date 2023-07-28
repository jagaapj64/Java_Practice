package InterviewTask;

public class WorkerThread implements Runnable {

	private String message;

	public WorkerThread(String message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message" + message);
		processMessage(); // call the processMesage method that thread sleep for 2s
		System.out.println(Thread.currentThread().getName() + " (End)");

	}

	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

}
