package test12;
// 접근범위가 큰 순서 : public > protected > default > private
class Money{
	int coin;
}
public class AccessTest {
	
	public static void main(String[] args) {
		Money m = new Money();
		System.out.println(m.coin);
	}
}
