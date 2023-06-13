package java_code;

public class FindIndexFirstOccurrenceInString {

	public static void main(String[] args) {
		String haystack = "butsadbutsad"; String needle = "sad";
		
		System.out.println(javaMethod(haystack,needle));
	}

	private static int javaMethod(String haystack, String needle) {
		for (int i = 0; i < haystack.length(); i++) {

			if(haystack.indexOf(needle)!=-1) {
			   return i;
			}
		}
		return 0;
		
	}

}
