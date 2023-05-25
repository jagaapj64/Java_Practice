package java_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveElementSpecficElement {

	public static void main(String[] args) {

		int[] nums = {3,2,2,3};
		int val = 3;
		javaMethod(nums,val);
		java8Method(nums,val);
	
	}

	private static void javaMethod(int[] nums, int val) {
	        int j=0;
	       for(int i=0;i<nums.length;i++){
	          if(nums[i]!=val){
	              nums[j++]=nums[i];
	          }
	       }
	       System.out.println(j);		
	}

	private static void java8Method(int[] nums, int val) {
		 List<Integer> list=IntStream.of(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
		 list.removeIf(e->e==val);
	      System.out.println(list);	
	      
	      Map<Boolean, List<Integer>> list2=IntStream.of(nums).boxed().collect(Collectors.partitioningBy(e->e!=val));
	      System.out.println(list2.get(true).size());	
	}

}
