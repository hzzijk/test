package test18;

public class Animal implements Action{
	//액션에 있는 메소드를 오버라이딩 안해주면 에러가 남.
	//마우스 올리면 구현하지 않은 메소드를 자동으로 추가해줌.
	@Override
	public void eat() {
		System.out.println("동물이 밥먹음");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		System.out.println("동물이 잠");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		System.out.println("동물이 걸음");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		System.out.println("동물이 뜀");
		// TODO Auto-generated method stub
		
	}

	
}
