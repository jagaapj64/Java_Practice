package InterviewTask;

public class StaticKeyword {

	 // static variable
    static int a = 110;
    int b=20;
    
    static void m1() {
    	a=200;
//    	b=200; // Cannot make a static reference to the non-static field b
//    	m2(); //Cannot make a static reference to the non-static method b
//    	System.out.println(super.a);
    }
    void m2() {
    	System.out.println("m2()");
    }
     
  
     
	public static void main(String[] args) {

		System.out.println("Value of a : "+a);
	       System.out.println("from main");
	}

}
