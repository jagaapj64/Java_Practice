package features_java;

public class FindFirstOccurenceString {

	public static void main(String[] args) {

		String haystack = "sadbutsad", needle = "but";
		int str = strStr(haystack, needle);
		System.out.println(str);
	}

	public static int strStr(String haystack, String needle) {
		String res = "";
		for (int i = 0; i < haystack.length(); i++) {

			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i) == needle.charAt(j)) {
					res = res + haystack.charAt(i);
					if (needle.equals(res)) {
						return haystack.charAt(i);
					}
				}

			}
		}
		return 0;

	}

}
