package InterviewTask;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread extends Thread {

	static ArrayList<String> list=new ArrayList<String>();
	public void run() {
		try {
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread is updating list");
		list.add("D");
	}
	
	public static void main(String[] args) throws InterruptedException {
		list.add("A");
		list.add("B");
		list.add("C");
		
		MyThread t=new MyThread();
		t.start();
		Iterator<String> itr=list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println("main thread is iterating list and current object is :"+ string);
			Thread.sleep(3000);
			
		}
		System.out.println(list);
		
//		C:\Users\CIPL1009\Pictures\Saved Pictures --- screenshots
		
	}
}
