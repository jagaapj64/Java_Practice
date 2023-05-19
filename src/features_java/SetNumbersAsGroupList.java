package features_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SetNumbersAsGroupList {

	public static void main(String[] args) {
		int[] input = { 3, 1, 3, 8, 3, 6, 8, 7, 8 };
		javaMethod(input);
//		javaCollectionMethod(input);

	}

	private static void javaCollectionMethod(int[] input) {

		List<Integer> list = IntStream.of(input).boxed().collect(Collectors.toCollection(ArrayList::new));

		Map<Integer, Integer> map = new HashMap<>();
		int count = 1;
		for (int i = 0; i < input.length; i++) {
			if (map.containsValue(input[i])) {

				continue;

			}
			map.put(count++, input[i]);
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					map.put(count++, input[i]);

				}
			}
		}

		map.forEach((k, v) -> {
			System.out.print(v + ",");
		});

	}

	private static void javaMethod(int[] input) {
//		{3, 3, 1, 1, 1, 8, 3, 6, 8, 7, 8};
		int[] result = new int[input.length];
		int a = 0;
		for (int i = 0; i < input.length; i++) {
			if (0 == input[i]) {

				a++;
				continue;

			}
			result[a++] = input[i];
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					result[a++] = input[i];
					input[j] = 0;

				}
			}
			a--;
		}
		for (int k : result) {
			System.out.print(k + " ");
		}
	}

}
