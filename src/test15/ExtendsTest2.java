package test15;

public class ExtendsTest2 {

	public static void main(String[] args) {
		Singer s1 = new Ssamd();
		Ssamd ss = (Ssamd)s1;
		System.out.println(ss.rapStyle);
		Singer s2 = new Mommyson();
		
		Singer s3 = new HipHopSinger();
		HipHopSinger hhs = (HipHopSinger) s3;
		System.out.println(hhs.rapSpeed);
		
	}
}
