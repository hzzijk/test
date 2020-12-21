package test08;

public class MatchNumber2 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,2,4};
		int num = 1;
		int cnt = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == num) {
				cnt++;
			}			
		}
		System.out.println(cnt);

/*
 * int n1 = 1		
 * int n2 = 2
 * int tmp = n1
 * int n1 = n2
 * int n2 = tmp
 * 
 */
	}
}
