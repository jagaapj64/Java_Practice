package java_code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximumOccurenceOfChar {

	public static void main(String[] args) {

		String str = "java program";

		List<Character> list = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

		Map<Character, Integer> map = new HashMap<>();

		for (Character character : list) {
			map.put(character, map.containsKey(character) ? map.get(character) + 1 : 1);
		}

		System.out.println(map.entrySet().stream().filter(e->e.getValue()>1).findFirst().get());
	

	}

}
