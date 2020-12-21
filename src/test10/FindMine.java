package test10;

import java.util.Random;

public class FindMine {

	public static void main(String[] args) {
//		String[] strs = {"1","2","3","꽝","5"};
		String[] strs = new String[5];
		Random r = new Random();
		//mineIdx는 최소 1 최대 5까지 나온다
		int mineIdx = r.nextInt(strs.length)+1;
		//strs배열의 각방과 값과 mineIdx의 값이 같을경우
		//숫자 문자열대신 꽝을 넣어라
		for(int i=0;i<strs.length;i++) {
			strs[i]=i+1+"";
			if(strs[i].equals(mineIdx+"")) {
				strs[i]="꽝";
			}		
		}
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
}
