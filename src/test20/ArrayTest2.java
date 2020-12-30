package test20;

class Dog{
	String name;
	int age;
	String type;	
}
public class ArrayTest2 {

	public static void main(String[] args) {
		String[] names = {"백구","황구","흑구","호구"};
		int[] ages = {4,7,11,3};
		String[] types = {"푸들","시츄","말티즈","진돗개"};

		Dog[] dogs = new Dog[3];
		for(int i=0;i<3;i++) {
//		double d = Math.random(); //0이상 1미만의 값이 나온다.
//		System.out.println(d);
//		double d = 0.123;
//		int i = (int)d; //더블을 인트로 다운캐스팅
//		System.out.println(i);

			double d = Math.random() * names.length;//4
			int num = (int)d;
			Dog dog = new Dog();
//			Dog dog = new Dog(); 포문 밖에서도 쓸수있게 밖으로 빼준다.
			dog.name = names[num];
			dog.age = ages[num];
			dog.type = types[num];
			dogs[i] = dog;
		}

		System.out.println(dogs[0].name);
		System.out.println(dogs[1].name);
		System.out.println(dogs[2].name);
//		System.out.println("이름 : " + names[num]);
//		System.out.println("나이 : " + ages[num]);
//		System.out.println("종 : " + types[num]);
	}
}
