package test24;

public class Constructor {
	
/*
 * 생성자는 클래스의 이름과 대소문자까지 동일해야한다.
 * 클래스명 앞에 아무것도 없다.
 * 언제호출되느냐? 메모리를 생성할때 호출되어서 생성자라고 부른다.
 * 메모리를 생성될때마다 호출됨.
 * 메서드랑 상당히 비슷해서 오버로딩을 제공해준다.
 * 메모리를 생성할때만 생성해서
 * c.Constructor(); 이런거 안됨.
 */
	
	Constructor(){
		System.out.println("난 메모리 생성할때마다 실행돼");
	}
	Constructor(int i){
		System.out.println("난 다른 생성자임");
	}
	public static void main(String[] args) {
		new Constructor();
		new Constructor(1);
	}
}
