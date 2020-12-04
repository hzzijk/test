package test04;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] nums = new int[3];
		/*
		 * nums의 각 방에
		 * nums[0] = 3;
		 * nums[1] = 6;
		 * nums[2] = 9;
		 */
		for(int i=0; i < nums.length;i++) {
			nums[i] = (i+1)*3 ;
		}
		for(int i=0; i < nums.length;i++) {
			System.out.println(nums[i]);			
		} // 바로써도 되지만 당분간은 출력 for문 까지 두번 씀.
		
		//1byte = 8bit
		//1bit가 표현할 수 있는 수는 1과 0뿐이 없다.

	}
}
