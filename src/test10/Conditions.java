package test10;

public class Conditions {

	public static void main(String[] args) {
		int[] nums = {3,2,1,4,5};
		int min = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(min>nums[i]) {
				min = nums[i];				
			}
		}
		System.out.print(min);
	}
}
