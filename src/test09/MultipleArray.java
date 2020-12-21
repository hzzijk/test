package test09;

public class MultipleArray {

	public static void main(String[] args) {
//다중배열
	
//		int[][] nums = new int[3][3];
//		int k = 1;
//		for(int i=0;i<nums.length;i++) {
//			for(int j=0;j<nums[i].length;j++) {
//				nums[i][j] = k++;
//				System.out.println(nums[i][j]);
//			}
//		}
		
		int[][] nums = new int[3][3];
		int k = 1;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				nums[i][j] = k++;
			}
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				System.out.println(nums[i][j]);
			}
		}

	}
}
