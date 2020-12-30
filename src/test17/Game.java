package test17;

public class Game {
	public int price;
	public String name;
	public String vendor;
	public String genre;
	public void startGame() {
		System.out.println(this.name + "을 시작한다!");
	}
	public void endGame() {
		System.out.println(this.name + "을 종료한다.");

	}
	public void playing() {
		System.out.println("아 뭔 게임인지 몰라도 뭐 하겠지~~");
	}
	public void getGameInfo() {
		System.out.println("게임명 : " + this.name);
		System.out.println("회사명 : " + this.vendor);
		System.out.println("가격명 : " + this.price);
		System.out.println("장르 : " + this.genre);
	}

	
}
