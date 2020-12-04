package test04;

public class Arraytest4 {

	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		
		//위의 strs각 방의 값의 길이가 2인것만 출력하는
		//반복문(for)을 작성해주세요.
		
		for(int i=0; i<strs.length; i++) {
			if(strs[i].length()==2) {
				System.out.println(strs[i]);
			}
		}
		// 영문소문자로 시작하면서 ()괄호 열고닫는것이 있으면 메서드다.
		// 배열은 length 메서드가 없음.
		// String 길이를 알 수 있는데 length라는 속성이 없다 메서드만 가지고 있다.
		
	}
}
