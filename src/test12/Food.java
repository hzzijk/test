package test12;

public class Food {
	String name;
	int price;
	String type;
	void makeSomeHappy() {
		System.out.println(name + "(" + type + ")은 우리를 행복하게해");
		System.out.println("하지만 " + price + "원 이라는 댓가를 치뤄야하지.");		
	}
	int howMuch() {
		return price;
	}
	String getType() {
		return type;
	}
	public static void main(String[] args) {
		Food f = new Food();
		f.name = "초밥";
		f.price = 30000;
		f.makeSomeHappy();
		f.type = "일식";
		f.makeSomeHappy();
		
//		int price = f.howMuch();
		System.out.println(f.howMuch() + "원... 비싸네...");
//		String type = f.getType();
		System.out.println("아, 이 음식은 " + f.getType() + "이구나~");
	}
}
