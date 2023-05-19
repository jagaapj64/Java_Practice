package java_code;

import java.util.Arrays;

public class FindLongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "coding", "coder", "codes" };
		findLongestCommonPrefixUsingJava(arr);

		System.out.println(findLongestCommonPrefixUsingIndexOf(arr));

	}

	

	public static String findLongestCommonPrefixUsingJava(String[] arr) {

		int size = arr.length;
		// The longest common prefix of an empty array is "".
		if (size == 0) {
			System.out.println("Longest common prefix: ");
		}
		// The longest common prefix of an array containing
		// only one element is that element itself.
		else if (size == 1) {
			System.out.println("Longest common prefix: " + arr[0]);
		} else {
			// Sort the array

			Arrays.sort(arr);
			int length = arr[0].length();
			StringBuilder res = new StringBuilder();
			// Comapre the first and the last strings character
			// by character.
			for (int i = 0; i < length; i++) {
				// If the characters match, append the character to the result.
				if (arr[0].charAt(i) == arr[size - 1].charAt(i)) {
					res.append(arr[0].charAt(i));
				}
				// Else, stop the comparison.
				else {
					break;
				}
			}

			return res.toString();
		}
		return null;
	}

	public static String findLongestCommonPrefixUsingIndexOf(String[] str) {
//		https://leetcode.com/problems/longest-common-prefix/solutions/1405155/java-detailed-solution-0-ms-faster-than-100/?page=2 ---> explaination here 
//		String[] arr = {"dog","racecar","dog"};
//		String[] arr   = {"flower","flow","flight"};
		String prefix = str[0];
		for (int index = 1; index < str.length; index++) {

			while (str[index].indexOf(prefix) != 0) {
				System.out.println(str[index].indexOf(prefix));
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}

}
