package test03;

public class ArrayTest5 {

	public static void main(String[] args) {
		String[] strs = new String[5];
		strs[0] = "1";
		strs[1] = "2";
		strs[2] = "3";
		strs[3] = "4";
		strs[4] = "5";
		
		for(int i = 0; i < strs.length; i++) {
				System.out.println("strs["+i+"] = "+strs[i]);
		}
	}
}
