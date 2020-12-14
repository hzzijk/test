package test07;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
//		System.out.println(num);
		int[] nums = new int[num];
		//위와 같은 프로그램이라면 nums.length가 아니라 num으로 해도됨.
		for(int i=0;i<num;i++) {
			nums[i] = (i+1)*5;
		}
		for(int i=0;i<num;i++){
			System.out.println(nums[i]);
		}
	}
}
