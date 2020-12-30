package test22;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		System.out.println(strList.size());
		strList.add("하나");
		System.out.println(strList.size());
		strList.add("둘");
		strList.add("셋");
		strList.add("넷");
		System.out.println(strList.size());
		System.out.println(strList);
	}
}
