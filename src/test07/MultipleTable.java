package test07;

import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
//구구단 이중포문
//Scanner를 사용해서 값을 입력 받은 뒤에
//예를 들어 3을 입력 받았다면 3단까지만 나오면 됩니다.
		Scanner s = new Scanner(System.in);
		System.out.print("몇 단까지 출력할까요?");
		String str = s.nextLine();
		int num = Integer.parseInt(str);
		
		for(int n1=1;n1<=num;n1++) {
			System.out.println("===="+n1+" 단====");
			for(int n2=1;n2<=9;n2++) {
				System.out.println(n1+"x"+n2+"="+n1*n2);	
			}
		}	
	}
}
