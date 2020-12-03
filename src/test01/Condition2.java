package test01;

public class Condition2 {
	
	public static void main(String[] args) {
		int a = 99;
		if(a<100) {
			System.out.println("a는 100보다 작네요");
		}else if(a>100) {
			System.out.println("a는 100보다 크네요");
		}else {
			System.out.println("a는 100이었군");
		}
		// 조건이 만족되어 식이 실행 되면 아래는 실행하지 않는다.
	
		int ab = 10;
		int bb = 101;
		//a도 100보다 작은지, b도 100보다 작은지를 물어보고 싶을때
		// && 는 and를 의미 
		// && 조건은 모든 조건이 트루여야지만 트루다.
		// or연산은 백스페이스 역슬래시 두개 ||
		if(ab<100 && bb<100) {
			System.out.println("a와 b는 모두 100보다 작다.");
		}
		
		if(ab<100 || bb<100) {
			System.out.println("a와 b 둘 중 하난 100보다 작군");
		}
	
	}
}
