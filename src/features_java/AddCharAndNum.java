package features_java;

public class AddCharAndNum {

	public static void main(String[] args) {
		char[] input = { 'a', ' ', 'b', ' ', ' ', 'c',' ',' '};
		addCharAndNumber(input);
		System.out.println();
		addCharAndNumberContinuosCount(input);

	}

	private static void addCharAndNumberContinuosCount(char[] input) {
		String[] res = new String[input.length];
		int count = 0;
		String concat="";
		for (int i = 0; i <= input.length - 1; i++) {

			for (int j = i + 1; j <= input.length - 1; j++) {
				if (input[j] == ' ') {

					count = count + 1;
					concat=concat+ count;
					input[j] ='0' ;
					
				} else
					break;

			}
			res[i] = String.valueOf(input[i]) + concat;
			concat="";

		}
		for (int i = 0; i <= res.length - 1; i++) {
			String string = res[i];
			if (!string.equals("0")) {
				System.out.print(string);
			}

		}		
	}

	private static void addCharAndNumber(char[] input) {
		String[] res = new String[input.length];
		int count = 0;
	
		for (int i = 0; i <= input.length - 1; i++) {

			for (int j = i + 1; j <= input.length - 1; j++) {
				if (input[j] == ' ') {

					count = count + 1;

				} else
					break;

			}
			if (input[i] != ' ' && count > 0) {
				res[i] = String.valueOf(input[i]) + count;

			} else if (input[i] != ' ') {
				res[i] = String.valueOf(input[i]);
			}
			count = 0;

		}
		for (int i = 0; i <= res.length - 1; i++) {
			String string = res[i];
			if (string != null) {
				System.out.print(string + " ");
			}

		}
	}
}

//a1nullb2 1nullc3 2 1nullnull