package test09;

public class MatchNumber {

	public static void main(String[] args) {
//alt + shift + x(엑스큐트), j
//alt + shift + d(디버깅), j		
		int[] nums = {1,1,1,2,2,3,4,5};
		int[] fNums = {1,2};
		int[] cnts = new int[fNums.length];
		//cnts[0] = 0, cnts[1] = 0		
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<fNums.length;j++) {
				if(nums[i]==fNums[j]) {
				cnts[j]++;
				}
			}
//			if(nums[i]==fNums[0]) {
//				cnts[0]++;
//			}//cnts배열의 0번째 값 0 에++
//			if(nums[i]==fNums[1]) {
//				cnts[1]++;
//			}//cnts배열의 1번째 값 0 에 ++
		}
		for(int i=0;i<fNums.length;i++) {
			System.out.println(fNums[i] + " : " + cnts[i]);
//		System.out.println(fNums[0] + " : " + cnts[0]);
//		System.out.println(fNums[1] + " : " + cnts[1]);
		}
	}
}
