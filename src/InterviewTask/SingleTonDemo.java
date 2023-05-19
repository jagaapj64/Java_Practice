package InterviewTask;

public class SingleTonDemo {

	private SingleTonDemo() {
		System.out.println("The Constructors is declare with private keyword");
	}
	
	public static SingleTonDemo getObject() {
		if(ref==null) 
			ref=new SingleTonDemo();
		
		return ref;
	}
	
	public static SingleTonDemo ref;
}
