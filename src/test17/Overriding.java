package test17;

class Over{
	public int getInt() {
		return 1;
	}
}
public class Overriding extends Over{
/*
 * 오버라이딩의 조건
 * 1. 일단 상속에서만 가능한 개념임.
 * 2. 메소드명이 같아야함.
 * 3. 매개변수의 타입, 개수, 순서가 모두 일치해야함.
 * 4. 메소드의 데이터 타입이 반드시 같아야 함.
 * 여기에 두가지가 더있음.
 */
	public int getInt(int i) {
		return 20;
	}
	public static void main(String[] args) {
		Over o = new Overriding();
//		int num = o.getInt(); 메소드의 데이터타입이 인트다.
		System.out.println(o.getInt());
		
	}
}
