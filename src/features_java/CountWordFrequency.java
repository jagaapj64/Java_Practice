package features_java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountWordFrequency {

	public static void main(String[] args) {
		String[] str = { "apple", "banana", "apple", "orange", "banana", "apple", "mango" };

		List<String> list = Arrays.asList(str);
		list.forEach(System.out::println);

		Map<String, Integer> map = new HashMap<>();
		for (String string : list) {
			map.put(string, map.containsKey(string) ? map.get(string) + 1 : 1);
		}
		System.out.println(map);

		int[] nums= {4, 2, 9, 5, 1, 7, 6};
		List<Integer> numbers = IntStream.of(nums).boxed().collect(Collectors.toList());
		
		int maxDifference = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
	    int minDifference = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();

		int difference = maxDifference - minDifference;
		System.out.println("Maximum difference: " + difference);
	}

}
