package test08;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random();		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = r.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
//		lotto[0] = r.nextInt(45);
//		lotto[1] = r.nextInt(45);
//		lotto[2] = r.nextInt(45);
//		lotto[3] = r.nextInt(45);
//		lotto[4] = r.nextInt(45);
//		lotto[5] = r.nextInt(45);
		
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
		
		
	}
}
