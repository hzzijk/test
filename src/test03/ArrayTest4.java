package test03;

public class ArrayTest4 {

	public static void main(String[] args) {
		boolean[] bls = new boolean[5];
		for(int i=0; i<bls.length; i++) {
			bls[i] = i % 2 == 0;
		}
		
		for(int i = 0; i<bls.length;i++) {
			System.out.println(bls[i]);
		}
	}
}
