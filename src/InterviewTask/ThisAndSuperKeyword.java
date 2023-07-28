package InterviewTask;

public class ThisAndSuperKeyword extends ParentClass {

	private int id;
	String name;
	String street;
	double salary;
	

	public ThisAndSuperKeyword(int id, double salary, String street) {
		this(salary, street);
		this.id = id;

	}

	public ThisAndSuperKeyword(int id, String string, double sal, String street) {
		this(id, sal, street);
		this.name = string;

	}

	public ThisAndSuperKeyword(double salary, String street) {
		super("Parent01");
		this.salary = salary;
		this.street = street;

	}

	public void callMethod(int id) {

		System.out.println("callMethod  : " + this.id);

		callAnotherMethod(this.id + 100);
	}

	public ThisAndSuperKeyword currentMethod() {

		return this;
	}

	private void callAnotherMethod(int id2) {
		System.out.println("callAnotherMethod : " + id2);
		System.out.println("parentId : " + super.parentId);
		System.out.println("id       : " + this.id);
		System.out.println("name     : " + this.name);
		System.out.println("salary   : " + this.salary);
		System.out.println("street   : " + this.street);
		super.parentMethod();

	}

	public static void main(String[] args) {
		ThisAndSuperKeyword th = new ThisAndSuperKeyword(10, "jaga", 10000, "T Nagar");
		th.callMethod(th.id);
		System.out.println(th.currentMethod().getClass().getCanonicalName());

	}
}
