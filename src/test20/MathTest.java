package test20;

public class MathTest {

	public static void main(String[] args) {
		//2번째 자리에서 올림
		double d = 0.113 * 10;
		d = Math.ceil(d);
		d /= 10;
		System.out.println(d);
		
		//2째 자리에서 반올림
		double d2 = 0.163*10; // 1.63
		d2 = Math.round(d2);
		d2 /= 10; // d = d / 10
		System.out.println(d2);
		
	}
}
