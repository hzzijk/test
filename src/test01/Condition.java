package test01;

public class Condition {
	
	public static void main(String[] args) {
		boolean higher;
		//비교한 결과는 모두 참 거짓으로 나옴. 불린에 저장가능함.
		//데이터타입선언 변수선언 = 값;
		int num1 = 200;
		int num2 = 200;
		higher = num1 > num2;
		System.out.println(higher);
		higher = num1 < num2;
		System.out.println(higher);
		
		//크거나 같다 작거나 같다로 외울것.
		//'='표시가 앞으로 나올 수 없다.
		higher = num1 >= num2;
		System.out.println(higher);
		higher = num1 <= num2;
		System.out.println(higher);
		
		int h1 = 5/2;
		// 5/2 => 2.5가 아니고 절삭 따라서 2가 나옴
		System.out.println(h1);
		int h2 = 5%2;
		//나머지 연산자? '%' 5&2 => 5나머지2 = 1
		// 5나누기 2의 값의 나머지가 1이니까.
		System.out.println(h2);
		//예전 게시판 페이징을 나머지로 계산함. 요즘엔 스마트렌더링.
		
		int hour = 3;
		//조건문
		if(hour<3) {
			System.out.println("3시간 전이면 아직 아침이지");
		} else {
			System.out.println("3시네, 밥묵자");
		}
		// if 괄호 안에는 데이터 타입이 불린인 것만 들어갈 수 있다.
		// 다시말해 비교하는 것만 들어갈 수 있다.
		// hour의 값이 3보다 작다면 중관호 안에 있는 식을 실행해라.
		// 아니면 else에 있는 중괄호 식을 실행해라.
		// 변수는 영역이 끝나면 쓸수 없다. 영역을 잘 알아보는게 좋음.
	}
}
