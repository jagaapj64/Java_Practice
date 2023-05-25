package java_code;

public class SearchInsertPosition {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 4, 6, 8 };
		int target = 5;
		System.out.println(javaMethod(nums, target));
	}

	private static int javaMethod(int[] nums, int target) {
		int[] temp = new int[nums.length + 1];

			for (int j = 0; j < nums.length; j++) {
			if (nums[j] == target) {
				return j;
			}else if (nums[j] < target) {
				temp[j] = nums[j];
			}else if (nums[j] > target) {
				temp[j]=target;
			
			}else {
				temp[j]=target;
			} 
		}
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == target) {
				return i;
			}

		}
		return 0;

	}

}
