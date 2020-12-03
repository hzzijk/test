package test03;

public class StringTest {

	public static void main(String[] args) {
		String str = "하이요, 안녕하세요";
		String search = "하이";
		if(str.indexOf(search)==-1) {
			System.out.println("없어.");
		}else {
			System.out.println("있어.");
		}
	}
}
