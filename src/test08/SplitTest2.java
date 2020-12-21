package test08;

import java.util.Scanner;

public class SplitTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(",를 기준으로 숫자만 : ");
		String str = s.nextLine();
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		//strs의 방개수와 같아야 하기때문에 위와같이 만든다.
		
		for(int i=0;i<strs.length;i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		//strs[i]의 값을 인티져로 바꿔서 대입해준다.
		//스트링 배열을 인트배열로 바꾸려면 일단 인트배열을 만든다
		for(int i=0;i<strs.length;i++) {
			System.out.println(nums[i]);
		}//스트링 배열을 인트배열로 바꾸는 법을 한것임
	}
}
