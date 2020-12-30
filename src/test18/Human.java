package test18;
/*
 * 상속은 클래스끼리만 가능하고, 인터페이스끼리만 가능하다.
 */
public class Human implements Action{
//
//인터페이스에 메소드가 4개가 있으면, 클래스에도 4개가 있어야함.
	public void eat() {
		System.out.println("사람이 밥먹음");
	}
	public void sleep() {
		System.out.println("사람이 잠");		
	}
	public void walk() {
		System.out.println("사람이 걸음");	
	}
	public void run() {
		System.out.println("사람이 뜀");
	}
}
