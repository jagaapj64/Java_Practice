package InterviewTask;

public class MORParent {

	public void method() {
		System.out.println("method overriding of parent");
	}
}

class MORChild extends MORParent {
//	@Override
	public void method() {
		System.out.println("method overriding of child");
	}
	public static void main(String[] args) {
		MORChild parent=(MORChild) new MORParent();
		parent.method();
	}
}