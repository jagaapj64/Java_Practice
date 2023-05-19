package InterviewTask;

public  class FinalizeMethod {

	public static void main(String[] args) {


		FinalizeMethod t1=new FinalizeMethod();
		String s="java";
		t1.finalize();
		t1.finalize();
		t1=null;
	
		System.gc();
		System.out.println("End of main");
		
	}

	public void finalize() {
		System.out.println("finalize() called ");
	}
}
