package test16;

class Father{
	void work() {
		System.out.println("아빠가 일합니다.");
	}
}
class Son extends Father{
	void work() {
		System.out.println("아들이 일합니다.");
	}
}
//주석처리하면 파더의 워크가 실행된다.
public class Overriding {
	public static void main(String[] args) {
		Father f = new Father();
		f.work();
//		Son s = new Son();
		Father s = new Son();
// 데이터타입이 파더입에도 불구하고 "아들이 일합니다."가 나온다.
// ㄴ오버라이딩 올라타다는 의미
		s.work();
	}
}
