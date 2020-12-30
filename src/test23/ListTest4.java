package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {
		//1098765...-1-2-3...-10
		List<String> strList = new ArrayList<String>();
		
		for(int i=10;i>=-10;i--) {
			strList.add(i+"");
		}
		System.out.println(strList);
		List<String> strList2 = new ArrayList<String>();
		// 1, -2, 3, -4, 5, -6, ... , -10
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				strList2.add(i*-1+"");
			}else {
				strList2.add(i+"");
			}
		System.out.println(strList2);
			
		}
	}
}
