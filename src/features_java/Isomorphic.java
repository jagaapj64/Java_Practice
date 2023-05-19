package features_java;

import java.util.HashMap;

public class Isomorphic {

	public static void main(String[] args) {

//		String s = "badc";	String t = "baba";
//		String s = "egg";	String t = "add";
		String s = "paper"; String t = "title";
//		String s="foo"; String t="bar";
//		String s="ab"; String t="ab";
//		String s = "aaeaa"; String t = "uuxyy"; //true
//		String s = "bbbaaaba";	String t = "aaabbbba";

		System.out.println(isomorphicJavaMethod(s, t));
		System.out.println(isomorphicJava8Method(s, t));

	}

	private static boolean isomorphicJava8Method(String s, String t) {

		HashMap<Character, Character> smap = new HashMap<Character, Character>();
		HashMap<Character, Boolean> mappedBefore = new HashMap<Character, Boolean>();
		boolean equivalent = true;

		for (int i = 0; i < s.length(); i++) {

			if (smap.containsKey(s.charAt(i))) {

				if (smap.get(s.charAt(i)) != t.charAt(i)) {
					equivalent = false;
					break;
				}
			} else {
				if (mappedBefore.containsKey(t.charAt(i))) {
					equivalent = false;
					break;
				} else {
					mappedBefore.put(t.charAt(i), true);
					smap.put(s.charAt(i), t.charAt(i));
				}
			}

		}
		return equivalent;

	}

	private static boolean isomorphicJavaMethod(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		if (s.length() == 1 || t.length() == 1 || s.equals(t)) {
			return true;
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && t.charAt(i) == t.charAt(j)) {
					return true;
				}

			}
		}
		return false;
	}

}
