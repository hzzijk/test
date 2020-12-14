package test05;

import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {
		/*
		 * Scan : 뭐가를 스캔하는거
		 * 스캔을 하려면 우선 뭔가를 입력해야한다.
		 * Input/Output
		 * In/Out
		 * I/O
		 * 스캐너는 뭘 스캔할지를 이야기를 해주어야 한다.
		 * System.in
		 */
		/*
		 * str의 조건이 1보다 크거나 같고 200보다 작은 숫자가 들어오면 정상입력
		 * 아니면 나이가 제멋대로 이네 이짜쓱!! 이 출력되게 하셈.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 살이니?");
		String str = scan.nextLine(); //넥스트라인 엔터칠때까지 기다림.
		
		System.out.println("니 나이 : " + str);
		int age = Integer.parseInt(str);
			if(age>=1 && age <200) {
				System.out.println("정상입력");
			}else {
				System.out.println("아 쫌!");
				}
//		String numStr = "22";
		//num의 데이터 타입을 int로 바꿀 수 없나?
		//parse 분석하다
		//load 읽어들이다
		//parseInt 인트로 분석하라, 숫자로 바꿀수 있는 문자열에 한해서 숫자로 바꿔줌
//		int num = Integer.parseInt(numStr);
//		System.out.println(0<num);
		
//		num = Integer.parseInt("백"); 자바가 읽을 수 있는 숫자형태가 아니어서 출력실행 후 에러가남.
		
		
	}
}
