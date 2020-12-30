package test20;
class Person{
	public String name;
	public int age;
}
public class ArrayTest {
/*
 * 양말[] 임시보관함 = 서랍;
 * 서랍 = new 양말[20];
 * 서랍[0] = 임시보관함[0];
 * 서랍[1] = 임시보관함[1];
 */
	public static void main(String[] args) {
		Person[] ps = new Person[5]; //이건 생성자가아님
//		Person p1 = new Person(); //이건 생성자
//		ps[0] = p1;
//		ps[0] = new Person();
		
		for(int i=0;i<ps.length;i++) {
			ps[i] = new Person();
			ps[i].name = "이름" + i;
			ps[i].age = i;
		}
		for(int i=0;i<ps.length;i++) {
			System.out.println("이름 : " + ps[i].name);
			System.out.println("나이 : " + ps[i].age);

		}
	}
}
