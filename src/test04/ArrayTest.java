package test04;
//패키지는 폴더의 개념, 분류를 위해서
public class ArrayTest {

	public static void main(String[] args) {
		// 예약어, 예약어들은 변수명으로 사용할 수 없다.
		int[] ints = new int[5];
		/*
		 * ints[0] = 100;
         * ints[1] = 200;
         * ints[2] = 300;
         * ints[3] = 400;
         * ints[4] = 500;		
		 */
		for(int i = 100 ; i<=500 ; i+=100) {
			//위의 로직으로 값이 ints배열에 들어가면 됩니다.
			int idx = i/100 - 1 ;
			ints[idx] = i;
		}	
		for(int i = 0 ; i < ints.length ; i++) {
			System.out.println(ints[i]);
		}
		
	}
}
