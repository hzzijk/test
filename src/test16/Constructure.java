package test16;

public class Constructure {
	/*
	 * public Constructure() {
	 * 
	 * } 가 숨어있다.생성자도 오버로딩이 된다. 메소드의규칙과같음.
	 * 생성자의 메모리를 생성하는 방법은 다섯개다.
	 */
	public Constructure() {
	
	}
	public Constructure(int num) {
		System.out.println("생성할 때 날 무조건 실행하게 되어있어서 생성자야.");
	}
	
	public static void main(String[] args) {
		Constructure con = new Constructure(10);//생성자;라고 부름.
		//모든 클래스는 생성자가 있다.
		//아무것도 안할거라면 굳이 생성자를 만들 필요는 없다.
		//생성 시점에 뭔가를 할거라면 생성자를 만들면 된다.
		//메소드와같이 생성자 인자값에 인트를 넣어주면 인트값을 넣어줘야 호출이 된다.
	}
}
