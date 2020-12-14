package test07;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * 반복문을 사용해서
		 * nums[0] = 5
		 * nums[1] = 10
		 * nums[2] = 15
		 * nums[3] = 20
		 * nums[4] = 25
		 */
		int[] nums = new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i] = (i+1)*5;
		}			
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
