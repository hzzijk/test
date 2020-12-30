package test20;

import java.util.Scanner;

public class ExceptionTest {
	String str;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 나이는? ");
		String numStr = s.nextLine();
		ExceptionTest et = new ExceptionTest();
		try {
			int num = Integer.parseInt(numStr);
			//num이 14라인까지 살아서 아래 실행문이 밖으로 빠지면 오류가 나서 데려옴.
			System.out.println("아 당신의 나이는 "+ num + "살 이군요.");
			System.out.println(et.str.equals("가나다"));
		}catch(NumberFormatException nfe) {
			System.out.println("숫자로만 입력해주세요.");
		}catch(NullPointerException npe) {
			System.out.println("와 null 에러가 뜬다고?");
		}

		
	}
}
