package test12;

public class MethodTest {
	static void watchMovie(int cnt) {
		int price = 12000;
		System.out.println("고객님의 요금은 "+(cnt*price)+"원 입니다.");
	}
	static int getCoffee(int money) {
		int price = 1500;
		if(money<price) {
			return -1;		
		}
		return money-price;
	}
	public static void main(String[] args) {
		int wallet = getCoffee(1000);
		if(wallet==-1) {
			System.out.println("커피가 비싸군");
		}
		
	}
}
