package java_code;

public class PrintCommonNumberInArrays {

	public static void main(String[] args) {


		int[] a= {6,8,3,7,2,1};
		int[] b= {3,4,6,7,5};
		
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
				
			}
			
		}
		
	}

}
