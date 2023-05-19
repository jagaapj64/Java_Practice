package SampleTest;

import java.util.Scanner;

public class FindElementAndIfExistPrintElement {



	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Element");
		int n=scn.nextInt();
		int[] a = {6,8,3,2,1};
		
	   findElementAndIfExistPrintElement(a,n);
		scn.close();
	}

	private static void findElementAndIfExistPrintElement(int[] a, int n) {

		boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n) {
				flag=true;
				System.out.println("element is found");
				break;
			}
			
		}
		if(flag==false)
		System.out.println("element is not found");
	}

}
