package test16;

class Person{
	String name;//참조형이라 널값
	public Person(String name) {
		this.name = name;
	}
}
public class Constructure2 {

	public static void main(String[] args) {
		Person p = new Person("윤웅재");
		System.out.println(p.name);
		Person p1 = new Person("윤치우");
		System.out.println(p1.name);
	}
}
