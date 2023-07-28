package InterviewTask;

import java.util.Arrays;
import java.util.List;

public class WithoutCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("without catch block");
			 System.gc();   
//			System.exit(0);
		}
		finally {
			System.out.println("finally block ");
		}
		List<Integer> list = Arrays.asList(2,3,5,10,20,-1);
		list.forEach(i -> {
		    if (i < 0) {
		        throw new IllegalArgumentException("Negative numbers are not allowed.");
		    }
		    System.out.println(i);
		});
	}

}
