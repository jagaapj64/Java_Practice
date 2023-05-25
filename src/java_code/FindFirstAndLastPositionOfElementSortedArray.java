package java_code;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastPositionOfElementSortedArray {

	public static void main(String[] args) {
		int[] nums = {1};
		int target = 1;
		int[] first = javaMethod(nums, target);
		for (Object i : first) {
			System.out.print(i);
		}

	}

	private static int[] javaMethod(int[] nums, int target) {
		List<Integer> list = new ArrayList<>();
	
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				list.add(i);
			}
		}
		if (list.isEmpty()) {
			list.add(-1);
			list.add(-1);
			list.toArray();
		}
		else {
			 list.toArray();
		}
		int[] temp=new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			temp[i]=list.get(i);
			
		}
		return temp;
	}
	

}
