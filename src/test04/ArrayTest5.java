package test04;

public class ArrayTest5 {

	public static void main(String[] args) {
		//indexOf(" ") 값이 없으면 -1이 나옴.
		String[] strs = new String[3];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		/*
		 * strs의 값의 문자열 중에 "이" 있는 것만 출력
		 * System.out.println(strs[0])
		 * 
		 */
		for(int i = 0 ; i < strs.length ; i++) {
			if(strs[i].indexOf("이") != -1) {
				System.out.println(strs[i]);				
			}
		}
		
	}
}
