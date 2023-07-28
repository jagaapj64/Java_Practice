package java_code;

public class Largest_Positive_Integer_That_Exists_With_Its_Negative {

	public static void main(String[] args) {
//		int[] nums = { 14, 33, 40, -33, 8, -24, -42, 30, -18, -34 };
		int[] nums = { -1, 2, -3, 3 };
//		int[] nums = {-10,8,6,7,-2,-3}; 
//		int[] nums = { -37, 37, -9, 2, 47, 18, 13, -11, 9, -28 };
		int result = findMaxK(nums);
		System.out.println(result);

	}

	private static int findMaxK(int[] nums) {
		int max = 0;
		int res = 0;
		int finalRes = -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0 && (-1) * nums[i] > finalRes) {

				max = nums[i];
				finalRes = maxValue(nums, max);
				if (res != -1) {
					finalRes = res;
				}
				nums[i] = 0;

			}

		}
		return finalRes;

	}

	private static int maxValue(int[] nums, int max) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == (-max)) {
				return (-max);
			}
		}
		return -1;
	}

}
