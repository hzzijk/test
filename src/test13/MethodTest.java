package test13;

public class MethodTest {
	void test() {
		System.out.println("test()호출!");
	}	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.test();
	}
}
