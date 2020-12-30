package test18;

public class Excute {
	public static void act(Action a) {
		a.eat();
		a.sleep();
		a.walk();
		a.run();
	}
	
	public static void main(String[] args) {
		Action a1 = new Animal();
		Action a2 = new Human();
		a1.eat();
		a2.eat();
		act(a1);
		act(a2);
		//여기서부터 헷갈리면 안됨. 정리해야함.
		//이 기점에서 흔들리면 끝까지 영향을 준다고 함.
	}
}
