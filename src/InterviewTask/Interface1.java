package InterviewTask;

public interface Interface1 {

	void method1();
	public default void log1(String str) {
		System.out.println("Interface : "+str);
	}
}
