package java_code;

import java.util.LinkedHashMap;

public class FindLongestSubString {
        // leetcode questions
	public static void main(String[] args) {

		String str = "abcabfcbb";
//		findLongestSubString(str);
		findSubStringUsingJava8(str);
	}

	private static void findSubStringUsingJava8(String str) {

		/*
		 * The main difference between HashMap and LinkedHashMap is that LinkedHashMap
		 * maintains the insertion order of keys, the order in which keys are inserted
		 * into LinkedHashMap. On the other hand, HashMap doesn't maintain any order or
		 * keys, or values.
		 */		
		char[] arr1 = str.toCharArray();
		String long_str = null;
		int str_length = 0;
		LinkedHashMap<Character, Integer> charsMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			char ch = arr1[i];
			if (!charsMap.containsKey(ch)) {
				charsMap.put(ch, i);
			} else {
				i = charsMap.get(ch);
				charsMap.clear();
			}
			if (charsMap.size() > str_length) {
				str_length = charsMap.size();
				long_str = charsMap.keySet().toString();
			}
		}
		System.out.println("Input String : " + str);
		System.out.println("The longest substring : " + long_str);
		System.out.println("The longest Substring Length : " + str_length);

	}

	private static String findSubStringUsingJava(String str, int beginInd, int endInd) {

		String s = " ";
		for (int i = beginInd; i < endInd; i++) {

			for (int j = beginInd; j < endInd; j++) {
				if (s.charAt(j) != str.charAt(j)) {
					s = s + str.charAt(j);
				}
			}

		}
		return s;
	}

	/**
	 * @param str
	 */
	private static void findLongestSubString(String str) {

		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {

				String s = findSubStringUsingJava(str, i, j + 1);

				System.out.println(s);
			}

		}

	}

}
