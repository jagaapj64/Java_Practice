package features_java;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix_Java8 {

	public static void main(String[] args) {
//		 List<String> strings =Arrays.asList("flower", "flow", "flight", "flame");
		List<String> strings = Arrays.asList("apple", "application", "aptitude");

		String longestCommonPrefix = strings.stream().reduce(LongestCommonPrefix_Java8::commonPrefix).orElse("");


		System.out.println("Longest common prefix: " + longestCommonPrefix);

	}

	private static String commonPrefix(String str1, String str2) {
		int minLength = Math.min(str1.length(), str2.length());
		int index = 0;

		while (index < minLength && str1.charAt(index) == str2.charAt(index)) {
			index++;
		}

		return str1.substring(0, index);
	}



}
