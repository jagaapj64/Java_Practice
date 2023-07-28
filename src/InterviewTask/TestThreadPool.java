package InterviewTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable runnable=new WorkerThread(" "+i);
			executorService.execute(runnable); // calling execute method of ExecutorService
			
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {}
		System.out.println("Finished all Threads..");

	}

}
