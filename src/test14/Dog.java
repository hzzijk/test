package test14;

class Animal{
	int age;
	String name;
	String type;
	int height;
}
public class Dog extends Animal{
	public static void main(String[] args) {
		//Dog는 Animal이라고 부를 수 있다. Animal이 Dog보다 상위개념.
		Animal a = new Dog();
		//Animal은 Dog라고 부를 수 없다.
		//Dog d = new Animal();은 안된다.
		
	}
}
