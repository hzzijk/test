package test05;

import java.util.Random;

public class DataType3 {

	public static void main(String[] args) {
		/*
		 * 1 - 45까지 중복되지 않은 숫자 6개가 똑같으면 1등
		 * 참조형 데이터타입은 몇가지를 빼놓고 어디에 있는지 알아야함.
		 * ctrl + shit + O 또는 데이터 타입에 마우스 올리고 클릭
		 * Random ran = new Random() 일단은 암기
		 * 괄호안에 랜덤이라 불리우는 건 다 넣을 수 있다.
		 * new 새로만들기, 기존의 값이 초기화된다.
		 * 스트링도 String str = new String("123"); 원래 이렇게 해줘야하는데
		 * 스트링은 많이 쓰여져서 String str = "123"; 이렇게 쓰인다.
		 * 당분간 참조형은 참조형데이터타입 변수 = new 참조형데이터타입()으로 쓴다.
		 */
		/*
		 * 변수 선언의 이유 ? 값들을 저장 시켜놓고 부를 수 있는 이름을 지정하기 위해
		 * 변수 선언을 위해서 데이터  타입을 선언해야 하는데
		 * 
		 */
		Random ran = new Random(); 
		System.out.println(ran.nextInt(2));
	}
}
