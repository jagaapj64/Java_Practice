package InterviewTask;

public class ChildAndParentMain {

	public static void main(String[] args) {

		
		Child c = name -> {
			return "With Parameter : Hello " + name;

		};
		System.out.println(c.childMethod("Java"));
		
		Child1 c1= ()->{
			return "With out Parameter : Hello Java";
		};

		System.out.println(c1.childMethod_01());
		
		
		Addable add=(a,b)->(a+b);
		
		System.out.println("without return keyword : "+add.add(10, 30));
		
		Addable add1=(a,b)->{
			return (a+b);
		};
		System.out.println("with return keyword : "+add1.add(50, 20));
	}

}
