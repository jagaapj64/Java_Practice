package features_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3NumsTriplets {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = findThreeSum(nums);
		System.out.println(result.toString());
	}

	private static List<List<Integer>> findThreeSum(int[] nums) {

		Arrays.sort(nums);
		Set<List<Integer>> res = new HashSet<>();

		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0)
					res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
				else if (sum > 0)
					k--;
				else if (sum < 0)
					j++;
			}
		}
		return new ArrayList<>(res);
	}
}
