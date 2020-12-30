package test24;

import java.util.ArrayList;
import java.util.List;

public class LoopTest {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		/*
		 * 0-100. 2-200 0~9번방까지 방을 만들어서 값을 넣어라
		 */
		for(int i=0;i<10;i++) {
			int num = (i+1) * 100;
			numList.add(num);
		}
		

		for(Integer n : numList) {
		System.out.println(n);
		}
		
	}
}
