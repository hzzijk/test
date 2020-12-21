package test11;

public class MemberTest {
	String name; //멤버변수, 멤버필드
	int age;
	
	void run() { //메소드의 선언
		System.out.println("아 뛰었더니 힘들당");
	}
	
	public static void main(String[] args) {
		MemberTest mt = new MemberTest();
		System.out.println(mt.name);
		System.out.println(mt.age);
		mt.run();//메소드의 호출
		//클래스 영역 안에 있으면서 다른 영역의 바깥에 있는 곳에는 선언과 초기화만 가능하다.
		//=>자바가 초기화 해줘서 널, 0이 나온다.
		//멤버변수일때그렇다
		//참조형은 널값으로 초기화, 인트는 0으로 초기화.
		
	}
}
