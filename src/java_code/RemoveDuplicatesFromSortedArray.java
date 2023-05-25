package java_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
//		javaMethod(nums);
		java8Method(nums);
	}

	private static void java8Method(int[] nums) {

		List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
		Set<Integer> set = new HashSet<>();
		list.removeIf(p -> !set.add(p));
//		list.forEach(System.out::println);

		List<Integer> list2 = IntStream.of(nums).boxed().collect(Collectors.toCollection(ArrayList::new)).stream()
				.distinct().collect(Collectors.toList());
		list2.forEach(System.out::println);

		List<Integer> list3 = IntStream.of(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list3);
		List<Integer> result = new ArrayList<>(linkedHashSet);
		System.out.println(result);

	}

	private static void javaMethod(int[] nums) {

		int[] temp = new int[nums.length];
		int j = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				temp[j++] = nums[i];
			}
		}

		temp[j++] = nums[nums.length - 1];

		for (int i = 0; i < j; i++) {
			nums[i] = temp[i];
		}

		System.out.println(j);
	}

}
