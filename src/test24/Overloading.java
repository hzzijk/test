package test24;

public class Overloading {

	/*
	 * 비슷한일을 하는 메소드들의 이름들을 다 따로 돌리면
	 * 만들때도 힘들고 사용할때도 힘들다.
	 * 같은 이름인데 매개변수에 따라 다른 일을 하게 만드는게 오버로딩임.
	 */
	void playGame(String name) {
		System.out.println(name + "게임을 합니다.");
	}
	void playGame(int cnt) {
		System.out.println(cnt + "만큼 게임을 했어요");
	}
	void playGame(String name, int cnt) {
		System.out.println(name + "게임을" + cnt + "만큼 했어요~");
	}
	public static void main(String[] args){
		Overloading ol = new Overloading();
		ol.playGame("스타크래프트");
		ol.playGame(5);
		ol.playGame("롤", 10);
	
	}
}
