package java_code;

public class PrintDuplicateElement {

//	https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
	public static void main(String[] args) {
//		int[] input = { 1, 2, 1, 2, 4 };

//		duplicateUsingJava(input);
		int numRay[] = { 1,4,2, 1, 2, 4};
		for (int i = 0; i < numRay.length; i++) {
			int temp = numRay[i] % numRay.length;
			int result = numRay[temp] + numRay.length;
			numRay[temp] = result;
		}
		System.out.println("The repeating elements are : ");
		for (int i = 0; i < numRay.length; i++) {
			if (numRay[i] >= numRay.length * 2) {
				System.out.println(i + " ");
			}
		}

	}

	private static int[] printNumbersAsc(int[] nums) {
		int temp;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] > nums[i + 1]) {
				temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
				i = -1;
			}

		}
		return nums;
	}

	private static void duplicateUsingJava(int[] sorted) {
		int[] nums = printNumbersAsc(sorted);
//		System.out.println(temp);
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == nums[i + 1]) {

				System.out.println(nums[i]);

			}
		}
	}

}
