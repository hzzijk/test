package test01;

public class Print {
	
	public static void main(String[] args) {
		int i = 7;
		int j = 5;
		// ln은 다른 라인에 표시해줌 print라고만 쓰면 한줄에 표시함.
		int sum = i+j;
		System.out.println(sum);
		System.out.println(i); 
		System.out.println(j);
		// ; 세미콜론까지가 하나의 식이다 라는 것을 말하는 것임.
		// 세미콜론은 습관 들이는게 좋음.
		// 가독성이 좋은 코드가 잘 짠 코드임.
		double dec1 = 1.5; //decimal
		double dec2 = 2.5;
		// 같은 영역에서 데이터 타입과 상관없이 변수명은 중복될 수 없다.
		// 중괄호부터 중괄호, 영역, 스코프
		double decSum = dec1+dec2;
		System.out.println(decSum);
		// 자바에서 '='은 대입을 말함.
		// *단, 우항에서의 모든 계산이 끝난 뒤 왼쪽에 대입한다.
		// 자바에서 같다는 의미는 '=='으로 표시한다.
		System.out.println(1==1);
		System.out.println(1!=2);
		// '!'를 부정연산자라고 함.
		// 논리형 데이터 타입 참,거짓을 boolean 이라고 함.
		boolean smart = (1==2);
		System.out.println(smart);
		/*
		 * 자바의 데이터 타입은 크게
		 * 1. 숫자 저장
		 *  1) 정수 저장
		 *   1-1) byte
		 *   1-2) short
		 *   1-3) int
		 *   1-4) long
		 *  2) 실수 저장
		 *   2-1) float
		 *   2-2) double
		 * 2. 문자 저장 : char
		 * 3. 논리 저장 : boolean
		 * 소문자로 시작하면 원시형 데이터 타입, 프리머티브 데이터타입
		 * 정해져 있는 데이터 타입 = 원시형 데이터타입
 		 */
	}
}
