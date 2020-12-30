package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	// 2,4,8,16...1024
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		
		for(int i=2;i<=1024;i*=2) {
		strList.add(i+"");
		}
		System.out.println(strList);
	}
}
