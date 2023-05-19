package java_code;

public class AddTwoMergeAndRemoveDuplicate {

	public static void main(String[] args) {

		int[] a = { 3, 4, 5 };
		int[] b = { 8, 9, 7 };
		int[] c = new int[a.length + b.length];
		int[] d = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (a.length > i) {
			c[k] = a[i];
			i++;
			k++;
		}
		while (b.length > j) {
			c[k] = b[j];
			j++;
			k++;
		}
		int index = 1;
		for (int n = 0; n <= c.length - 1; n++) {
			if (index != n) {
				d[n] = c[n];
			}

		}

		for (int m = 0; m <= d.length - 1; m++) {
			if (d[m] != 0) {
				System.out.println(d[m]);
			}

		}
	}

}
