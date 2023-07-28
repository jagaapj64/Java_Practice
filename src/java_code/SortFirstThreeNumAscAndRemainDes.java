package java_code;

import java.util.Arrays;

public class SortFirstThreeNumAscAndRemainDes {

	public static void main(String[] args) {

		int[] arr = { 2,46,9,10,11,23};

//		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());

		int n = arr.length;
		arraysSort(arr, n);
		System.out.println("normal method : ");
		normalMethod(arr, n);

	}

	private static void normalMethod(int[] a, int n) {
		{
			int temp;
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n / 2; j++) {
					if (a[j] > a[j + 1]) {
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}

				for (int j = n / 2; j < n - 1; j++) {
					if (a[j] < a[j + 1]) {
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}

			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
		}
	}

	private static void arraysSort(int[] arr, int n) {
		Arrays.sort(arr);

		// printing first half in ascending order
		for (int i = 0; i < n / 2; i++) {
			System.out.print(arr[i] + " ");
		}
		// printing second half in descending order
		for (int j = n - 1; j >= n / 2; j--) {
			System.out.print(arr[j] + " ");
		}

	}

}