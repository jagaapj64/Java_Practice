package java_code;

public class MaximumNumberOfStringPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "cd", "ac", "dc", "ca", "zz" };
		int result = maximumNumberOfStringPairs(words);
		System.out.println(result);

	}

	public static int maximumNumberOfStringPairs(String[] words) {
		String res = "";
		int count = 0;
		for (int i = 0; i < words.length-1; i++) {
			for (int j = i + 1; i < words.length-1; j++) {
				int jval=words[j].length() - 1;
				for (int m = jval; m >= 0; m--) {
					res = res + words[j].charAt(m);
				}
				if (words[i].equals(res)) {
					count = count + 1;
					}
				res="";
			}
			
		}
		return count;
	}

}
