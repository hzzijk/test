package test14;


class Father{
	int money = 10000;
	String fName = "손";
	String laNme = "웅정";
}

public class Son extends Father{
	int money = 1000;
	String lName = "흥민";

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.fName+s.lName);
	}
}
