package java_code;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumTwoDigitAs9 {

	public static void main(String[] args) {

		String[] str= {"java","python","javascript"};
		
		Arrays.asList(str).stream().flatMap(s->Stream.of(s.charAt(2))).forEach(System.out::println);
		
	  IntStream.rangeClosed(1, 100)
		.boxed()
		.flatMap(i -> IntStream.rangeClosed(i + 1, 100)
		.filter(j -> i + j == 9)
		.mapToObj(j -> new int[]{i, j}))
		.forEach(pair -> System.out.println(pair[0] + " + " + pair[1] + " = 9"));
	}

}
