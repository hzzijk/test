package test04;

public class StringTest {

	public static void main(String[] args) {
		String str = "가나다라마바사";
//		System.out.println(str.length());
//		System.out.println(str.indexOf("카"));
//		System.out.println(str.substring(1,2));
		//하나는 시작점 이전을 다 잘라라, 두개는 시작 번호 끝 번호
		//몇번째인지를 찾아서 자를때 indexOf랑 substring을 많이 씀.
		
//		System.out.println(str.contains("차"));
					//contains의 s는 복수가 아니다. 3인칭 단수를 만난 동사다.
		//있냐 없냐를 찾을 땐 contains를 많이 씀. 단, 예전 자바에는 없음.
		
//		System.out.println(str.replace("가나", "우리"));
//		//str.replace는 str을 바꾸는 게 아니라 출력만 바꿔준다. 그래서 str자체는 안바뀐다.
//		//str = System.out.println(str.replace("가나", "우리")); 해줘야 바뀐다.
//		System.out.println(str);
		str = "  하이  ";
		System.out.println(str.trim());
		//.trim() 문자열 양 옆의 스페이스공간을 지워줌. 가운데 공백은 못지워줌.
		// str자체를 바꾸는 것이 아니어서 바구고 싶으면 str=str.trim 처럼 값 자체를 바꿔주어야 한다.
		
		
		
		
	}
}
