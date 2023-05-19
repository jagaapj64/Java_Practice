package features_java;

import java.util.Arrays;
import java.util.List;

public class findMaximumSubArray {

	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		
		List<Integer> list = Arrays.asList(2,3,5,10,20);
		list.forEach(i -> {
		    if (i < 0) {
		        throw new IllegalArgumentException("Negative numbers are not allowed.");
		    }
		    System.out.println(i);
		});

		int n = nums.length;
		int max = Integer.MIN_VALUE, sum = 0;

		for (int i = 0; i < n; i++) {
			sum += nums[i];
			max = findMax(sum, max);

			if (sum < 0)
				sum = 0;
		}

		System.out.println(max);
	}

	private static int findMax(int sum, int max) {
		return (sum >= max) ? sum : max;
	}
}
