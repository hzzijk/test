package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	//반복문으로 1~10
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		for(int i=1;i<=10;i++) {
			strList.add(i+"");
		}
		
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}

		
	}
}
