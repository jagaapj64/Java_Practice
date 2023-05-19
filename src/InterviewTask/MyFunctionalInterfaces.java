package InterviewTask;

@FunctionalInterface
public interface MyFunctionalInterfaces {

	// Default Method - Optional can be 0 or more
	public default String HelloWorld() {
		return "Hello World";
	}

	// Static Method - Optional can be 0 or more
	public static String CustomMessage(String msg) {
		return msg;
	}

	// Single Abstract Method
	public void bar();
	
	
}
