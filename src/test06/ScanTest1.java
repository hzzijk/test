package test06;

import java.util.Scanner;

public class ScanTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		String str1 = scan.nextLine();
		System.out.print("연산자 : ");
		String op = scan.nextLine();
		System.out.print("두번째 숫자 : ");
		String str2 = scan.nextLine();
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		if(op.equals("+")) {
			System.out.println(n1+n2);
		}else if(op.equals("-")) {
			System.out.println(n1-n2);
		}else if(op.equals("*")) {
			System.out.println(n1*n2);
		}else if(op.equals("/")) {
			System.out.println(n1/n2);
		}
	}
}
