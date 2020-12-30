package test21;

public class ArrayTest {


	public static void main(String[] args) {
		int[] nums = new int[1];
		nums[0] = 5;
		
		int[] tmp = nums;
		nums = new int[nums.length+1];//방을 한개 더 늘리려고 +1한거임
		for(int i=0;i<tmp.length;i++) {
			nums[i] = tmp[i];
		}
		nums[1] = 10;
		ArrayUtil.printArray(nums);
		ArrayUtil.printArray(nums);
	}
}
