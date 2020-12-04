package test04;

public class ArrayTest6 {

	public static void main(String[] args) {
		String[] menus = new String[3];
		menus[0] = "아이스크림";
		menus[1] = "치킨";
		menus[2] = "피자";
		//배열은 같은 데이터 타입일 경우 여러개의 변수를 하나에 들고 다닐 수 있는 장점이 있다.
		//데이터타입은 하나여야한다. 방길이를 알려줘야한다. 늘리기가힘들다.
		String[] tmpMenus = menus;
		menus = new String[4];
		for(int i = 0;i<tmpMenus.length;i++) {
			menus[i] = tmpMenus[i];
		}
		
			menus[3] = "맥주";
	
		for(int i = 0;i<menus.length;i++) {
		System.out.println(menus[i]);
		}
		//Swap 바꾸는것, 예전에 있던걸 기억해야함
		
	
 	}
}
