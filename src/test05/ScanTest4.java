package test05;

import java.util.Scanner;

public class ScanTest4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		String numStr1 = s.nextLine();
		System.out.print("두번째 숫자 : ");
		String numStr2 = s.nextLine();
		System.out.print("연산자 : ");
		String operator = s.nextLine();
		
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		if(operator.contentEquals("+")) {
					//내용이 같은지 강조하는거임 equals도 동일한 값이 나옴.
			System.out.println(num1+num2);
		}
		else if(operator.contentEquals("-")) {
            System.out.println(num1-num2);
		}
		else if(operator.contentEquals("*")) {
            System.out.println(num1*num2);
		}
		else if(operator.contentEquals("/")) {
            System.out.println(num1/num2);
		}
		else if(operator.contentEquals("%")) {
            System.out.println(num1%num2);
		}
		/*
		 * java에서 더하기 연산자가 하는 일
		 * 숫자랑 숫자가 만나면 더하기
		 * 문자랑 숫자가 만나면 연결
		 * 문자랑 문자가 만나도 연결
		 */
		
	}
}
