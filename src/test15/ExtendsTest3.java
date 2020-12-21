package test15;

public class ExtendsTest3 {

	static void singingSinger(Singer s) {
		s.singing();
	}
	public static void main(String[] args) {
		Mommyson m = new Mommyson();
		Ssamd ss = new Ssamd();
		singingSinger(m);
		singingSinger(ss);		
	}
}
