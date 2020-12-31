package test26;

public class Condition {

	public static void main(String[] args) {
	//정수
		int age = 21;
		if(age/10==0) {
			System.out.println("유아기");
		}else if(age/10==1) {
			System.out.println("청소년");
		}else if(age/10==2) {
			System.out.println("사회초년생");
		}else if(age/10==3) {
			System.out.println("공포의쓴맛");
		}else if(age/10>=4) {
			System.out.println("인생무상");
		}
		// 자바1.7이상부터는 String도 됨. 원래는 정수만 됨.
		// Switch int char String
		int gener = age/10;
		switch(gener) { //브레이크를 안걸면 실행문 아래(다른케이스)로 다 실행됨.
			case 0 :
				System.out.println("유아기");
				break;
			case 1 :
				System.out.println("청소년");
				break;
			case 2 :
				System.out.println("사회초년생");
				break;
			case 3 :
				System.out.println("공포의쓴맛");
				break;
			default :
				System.out.println("인생무상");
		}
	}
}
