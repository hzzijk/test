package test08;

public class SplitTest {

	public static void main(String[] args) {
		String str = "100,23,11,40";
		int idx = str.indexOf(",");
		String str1 = str.substring(0,idx);
		System.out.println(str1);
		str = str.substring(idx+1);
		System.out.println(str);
		
	}
}
