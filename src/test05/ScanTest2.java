package test05;

import java.util.Scanner;

public class ScanTest2 {

	public static void main(String[] args) {
		/*
		 * 학년 : 1학년부터 3학년까지만 존재, 벗어나면 학년을 잘못입력하셨습니다.
		 * 반 : 1-10반까지만 존재함, 반을 잘못입력하엿습니다.
		 * 이름 : 그대로.
		 */
		System.out.print("학년 : ");
		Scanner scan = new Scanner(System.in);
		String grade = scan.nextLine();
		int gradeNum = Integer.parseInt(grade);
		if(gradeNum<1 || gradeNum>3) {
			System.out.println("학년이 잘못되었습니다.");
		}
		
		System.out.print("반 : ");
		String clazz = scan.nextLine(); //class라는 예약어가 있어서 변수명으로 zz로 바꿈.
		
		System.out.print("이름 : ");
		String name = scan.nextLine();

		System.out.println(grade + "학년 " + clazz
				+ "반 " + name + "님 반갑습니다.");

//		System.out.print("학년 : ");		
//		Scanner scan = new Scanner(System.in);
//		String grade = scan.nextLine();		
//		
//		System.out.print("반 : ");
//		String clazz = scan.nextLine(); //class라는 예약어가 있어서 변수명으로 zz로 바꿈.
//
//		System.out.print("이름 : ");
//		String name = scan.nextLine();
//
//		int grd = Integer.parseInt(grade);
//		int clz = Integer.parseInt(clazz);
//		if(grd < 1 || grd >3) {
//			System.out.println("학년을 잘못 입력하셧습니다.");
//		}else if(clz < 1 || clz >10) {
//			System.out.println("반을 잘못 입력하셧습니다.");
//		 } else {
//			System.out.println(grade + "학년 " + clazz
//			+ "반 " + name + "님 반갑습니다.");
//		   }

			
				
		
	}
}
