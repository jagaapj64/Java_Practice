package java_code;

public class FindLongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "coding", "coder", "codes" };

		System.out.println(findLongestCommonPrefixUsingIndexOf(arr));

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
