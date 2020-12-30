package test23;

//클래스에 쓸 경우 독신주의자이기 때문에 어떠한 클래스도 상속을 받을 수 없음!
final class Single{
	
}
class F {
	//메소드에 쓸 경우 test()메서드를 오버라이딩할 수 없음!
	public final void test() {
		System.out.println("난 F의 test함수!");
	}
}
public class FinalTest extends F{

//	public void test() {
//		System.out.println("난 FinalTestdml test함수!");
//	}주석풀면 에러남. 테스트가 파이널메서드여서.
	public final int NUMBER_TEST=10;
	//멤버변수는 상수일경우 대문자로, 두글자는 언더스코어로(스네이크케이스)
	
	public static void main(String[] args) {
		//num앞에 쓸경우 상수, 즉 초기화 된 값으로 고정됨, 바꿀 수 없음.
		final int num = 10;
	}
}
