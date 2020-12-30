package test17;

public class Excute {

	public static void main(String[] args) {
//		CrazyArcade ca = new CrazyArcade();
//		ca.name="크아";
//		ca.price=0;
//		ca.genre="캐쥬얼";
//		ca.vendor="넥슨";
//		ca.startGame();
//		ca.playing();
//		ca.endGame();
		
		Game game = new CrazyArcade();
		game.name="크아";
		game.price=0;
		game.genre="캐쥬얼";
		game.vendor="넥슨";
		game.startGame();
//		CrazyArcade ca = (CrazyArcade)game;
//		ca.playing(); 이렇게 캐스팅을 해주거나 아래와 같이 오버라이딩 시켜줘서 오류를 없앨 수 있다.
		game.playing();
		game.endGame();
	}
}
