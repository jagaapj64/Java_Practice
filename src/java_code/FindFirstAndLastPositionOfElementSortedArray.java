package java_code;

public class FindFirstAndLastPositionOfElementSortedArray {

	public static void main(String[] args) {
		int[] nums = {1,3,8};
		int target = 1;
		int[] first = javaMethod(nums, target);
		for (Object i : first) {
			System.out.print(i+" ");
		}

	}

	private static int[] javaMethod(int[] nums, int target) {

		int[] temp = new int[2];
		temp[0] = -1;
		temp[1] = -1;

		int m = 0;
		for (int i = 0; i < nums.length ; i++) {
			if (nums.length == 1 && nums[i] == target) {
				temp[m++] = i;
				temp[m] = i;
				return temp;
			}
			if (nums[i] == target) {
            
				temp[m++] = i;

			}
			else {
				temp[m++] = i;
				temp[m] = i;
			}

		}

		return temp;
	}
}
