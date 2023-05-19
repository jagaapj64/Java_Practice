package java_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseDigit {

	public static void main(String[] args) {
		int x=1534236469;
		System.out.println("original number : "+x+"\n");
		System.out.println("JavaMethod : ");
		System.out.println("reversed number : "+reverseDigitJava(x)+"\n");
		reverseDigitJava8(x);
      
      
      
	}

	private static void reverseDigitJava8(int x) {

		int[] a = Integer.toString(x).chars().map(c -> c - '0').toArray();

		List<Integer> list = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));

		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("Java8Method : "+"\n"+"reversed number : ");
		
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

	private static int reverseDigitJava(int x) {
		int temp=x;
	      int rem=0;
	      int reverse=0;
	      
			while (temp != 0) {

				rem = temp % 10;
				reverse = reverse*10 + rem;
				temp = temp / 10;

			}
			return reverse;		
	}

}
