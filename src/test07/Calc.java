package test07;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// 1 + 2 가 나오면 => 3을 출력하면됨
		// 연산자는 +,-,*,/,%를 if문으로 구현하라.
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		String numStr1 = s.nextLine();
		System.out.print("연산자 : ");
		String op = s.nextLine();
		System.out.print("두번째 숫자 : ");
		String numStr2 = s.nextLine();
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);

		if(op.equals("+")) {
		System.out.print(num1+num2);
		}else if (op.equals("-")) {
			System.out.print(num1-num2);
		 }else if (op.equals("*")) {
			System.out.print(num1*num2);
		  }else if (op.equals("/")) {
			System.out.print(num1/num2);
		   }else if (op.equals("%")) {
			System.out.print(num1%num2);
		    }

	}
}
