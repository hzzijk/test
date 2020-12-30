package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		// String만 저장가능한 List변수를 만들어서
		// 0번째5, 1번째 10, ..., 9번째 50이 들어갈수있도록 포문완성.
		List<String> strList = new ArrayList<String>();
		//for(int i=5;i<=50;i+=5)
		//for(int i=0;i<=9;i++) {
		for(int i=5;i<=50;i+=5) {
			strList.add(i+"");
		}
		System.out.println(strList);
		
		int sum = 0;
		for(int i=0;i<strList.size();i++) {
			int num = Integer.parseInt(strList.get(i));
			sum += num;
		}
		System.out.println(sum);		

	}
}
