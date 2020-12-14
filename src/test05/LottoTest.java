package test05;

import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		Random r = new Random();
		/*
		 * 1-45까지의 랜덤 숫자 6개가 출력되었으면 좋겠다.
		 */
//		System.out.println(r.nextInt(45)+1);
//		System.out.println(r.nextInt(45)+1);
//		System.out.println(r.nextInt(45)+1);
//		System.out.println(r.nextInt(45)+1);
//		System.out.println(r.nextInt(45)+1);
//		System.out.println(r.nextInt(45)+1);
//		int[] lotto = new int[6];
//		for(int i=0;i<lotto.length;i++) {
//			lotto[i] = r.nextInt(45)+1;
//		}
//		
//		for(int i=0;i<lotto.length;i++) {
//			System.out.println(lotto[i]);
//		}
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			int rNum = r.nextInt(45)+1;
			lotto[i] = rNum;
			for(int j=i-1; j>=0;j--) {
				if(rNum==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}		
		
	}
}
