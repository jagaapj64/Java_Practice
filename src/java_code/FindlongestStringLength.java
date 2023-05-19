package java_code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindlongestStringLength {

	public static void main(String[] args) {

		String[] str= {"aamir","meeran","jaga"};
		List<String> list=Arrays.asList(str);
		
		// Using Stream.collect() method
		FindlongestStringLengthUsingStreamCollect(list);
		
		//Using Stream.max() method 
		FindlongestStringLengthUsingStreamMax(list);
		
		FindlongestStringLengthUsingStreamReduce(list);
		
		FindlongestStringLengthUsingStreamSorted(list);
		
		FindlongestStringLengthUsingCollections(list);
		
		
		
	}

	private static void FindlongestStringLengthUsingCollections(List<String> list) {
		String name=Collections.max(list, Comparator.comparing(String::length));
		System.out.println("Longest String is : "+name);
		System.out.println("Length of longest String is : "+name.length());
				
	}

	private static void FindlongestStringLengthUsingStreamSorted(List<String> list) {
//		[aamir, meeran, jaga]
//				meeran
//				aamir
//				jaga


		System.out.println(list.toString());
		list.stream().sorted((s1, s2) -> s1.length() > s2.length() ? -1 : 1).findFirst().get();
		
	}

	private static void FindlongestStringLengthUsingStreamReduce(List<String> list) {

		String name = list.stream().reduce((x, y) -> x.length() > y.length() ? x : y).get();
		System.out.println("Longest String is : "+name);
		
		int Length=list.stream().mapToInt(String::length).reduce((x,y)->Integer.max(x, y)).getAsInt();
		System.out.println("Length of longest String is : "+Length);
	}

	private static void FindlongestStringLengthUsingStreamMax(List<String> list) {
        // find Longest name in the list 
		String name=list.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println("Longest String is : "+name);
		
		// find Longest length of string in the list
		int Length=list.stream().map(String::length).max(Integer::compare).get();
		System.out.println("Length of longest String is : "+Length);	
	}

	private static void FindlongestStringLengthUsingStreamCollect(List<String> list) {
		String name=list.stream().collect(Collectors.maxBy(Comparator.comparingInt(String::length))).get();
		System.out.println("Longest String is : "+name);
		
		int Length=list.stream().collect(Collectors.summarizingInt(String::length)).getMax();
		System.out.println("Length of longest String is : "+Length);		
	}

}
