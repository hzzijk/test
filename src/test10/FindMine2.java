package test10;

import java.util.Random;
import java.util.Scanner;

public class FindMine2 {

	public static void main(String[] args) {
		String[] strs = new String[5];
		Random r = new Random();
		int mine =r.nextInt(strs.length)+1;
		for(int i=0;i<strs.length;i++) {
			strs[i] = i+1+"";
			if(strs[i].equals(mine + "")) {
				strs[i] = "꽝";
			}
		}
		Scanner s = new Scanner(System.in);
		System.out.println("1~5 숫자 : ");
		String myStr = s.nextLine();
		int idx = 0;
		for(int i=0;i<strs.length;i++) {
			if(strs[i].equals("꽝")) {
				idx = i+1;
				break;
			}
		}
		if(myStr.equals(idx+"")) {
			System.out.println("찾았다!");
		}else {
			System.out.println("찾았다!");
		}

		/*
		 * 1~5까지의 숫자를 입력받는다.
		 * 해당 숫자가 각방에 들어가있는 숫자와 비교해
		 * 꽝이면 찾았다
		 * 아니면 틀렸다 를 출력하면 됩니다.
		 */
	}
}
