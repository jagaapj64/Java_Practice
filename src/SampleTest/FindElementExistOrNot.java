package SampleTest;

import java.util.Scanner;

public class FindElementExistOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Element");
		int n=scn.nextInt();
		int[] a = {6,8,3,2,1};
		
		System.out.println(findElementExistOrNot(a,n));
		scn.close();
	}

	private static boolean findElementExistOrNot(int[] a,int n) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n) {
				return true;
			}
			
		}
		return false;		
	}
}
