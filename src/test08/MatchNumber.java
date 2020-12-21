package test08;

public class MatchNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int num = 6;
		
		boolean hasNum = false;
		
		for(int i=0;i<nums.length;i++) {	
			if(nums[i]==num) {
				hasNum = true;
				break;
			}
		}
		if(hasNum) {
			System.out.println("있다");
		}else {
			System.out.println("없다");
		}		
		//있으면 있다 없으면 없다라고 출력하는 거
	}
}
