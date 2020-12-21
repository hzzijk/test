package test15;

public class ExetendsTest {

	public static void main(String[] args) {
		/*
		 * Singer
		 * 	-HipHopSinger
		 *   -Ssamd
		 *   -MommySon 
		 */
		Singer s = new HipHopSinger();
		s = new Ssamd();
		s = new Mommyson();
		/*
		 * 위의 상속 관계를 보자면
		 * Singer가 제일 상위기 때문에 그 하위의 클래스(즉 Singer를 상속받은애들)
		 * 은 모두다 Singer 데이터타입의 변수에 대입이 가능함.
		 * 
		 */
		HipHopSinger hhs = new Ssamd();
		hhs = new Mommyson();
		/*
		 * HipHopSinger 역시도 Mommyson과 Ssamd가 상속 받았기 때문에
		 * Mommyson, Ssamd 모두 HipHopSinger라고 불러도 된다.
		 *
		 */
		Ssamd ss = new Ssamd();
		Mommyson m = new Mommyson();
		/*
		 * 당연히 Ssamd는 Ssam라고
		 * Mommoyson은 Mommyson이라고 불러도 된다.
		 */
		HipHopSinger hhs1 = new HipHopSinger();

		
	}
}
