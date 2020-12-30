package test21;

public class ArrayTest2 {

	static String[] add(String[] arr, String str) {
		String[] tmp = arr;
		arr = new String[arr.length+1];
		for(int i=0;i<tmp.length;i++) {
			arr[i] = tmp[i];
		}
		arr[arr.length-1] = str;
		
		return arr;		
	}
	
	public static void main(String[] args) {

		String[] strs = new String[0];
		//ArrayTest2.add(strs);
		strs = add(strs,"하나");
		strs = add(strs,"둘");
		strs = add(strs,"셋");
		strs = add(strs,"넷");
		System.out.println(strs.length);
		ArrayUtil.printArray(strs);				
	}
}
