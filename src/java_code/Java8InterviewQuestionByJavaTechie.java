package java_code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8InterviewQuestionByJavaTechie {

	public static void main(String[] args) {
		String str = "HelloJavaWorld";

//		String[] listString=str.split("");
//		System.out.println(Arrays.toString(listString));

		List<Character> charsList = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		Map<Character, Long> maplist = charsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(maplist);

		List<Character> duplicateElement = charsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());

		System.out.println("duplicateElement : " + duplicateElement);

		List<Character> uniqueElement = charsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());

		System.out.println("uniqueElement : " + uniqueElement);

		Character findFirstUnique = charsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst().get();

		System.out.println("findFirstUniqueElement : " + findFirstUnique);

		Character findFirstDuplicate = charsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst().get();

		System.out.println("findFirstUniqueElement : " + findFirstDuplicate);

		int[] nums = { 45, 11, 2, 67, 8, 132, 9, 1 };

		Integer integer = Arrays.stream(nums).boxed().sorted().skip(1).findFirst().get();
		System.out.println(integer);

		String[] string = { "java", "spring", "springboot" };

		String longestString = Arrays.stream(string)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();

		System.out.println("longestString : " + longestString);

		Collection<String> numberStartWith = Arrays.stream(nums).boxed().map(s -> s + "")
				.filter(s->s.startsWith("1")).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("numberStartWith : "+numberStartWith);
		
		List<String> joinList=Arrays.asList("A","B","C","D");
	
		String result=String.join("-", joinList);

		System.out.println("StringJoin : "+result);
		
		IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);
	}

}
