package test20;

class Food{
	String name;
}
public class ArrayTest3 {
	public static void main(String[] args) {
		Food[] menus = new Food[2];
		menus[0] = new Food();
		menus[1] = new Food();
		menus[0].name = "볶음밥";
		menus[1].name = "짜장면";

		Food[] tmpMenus = menus;		
		menus = new Food[4];
		for(int i=0;i<tmpMenus.length;i++) {
			menus[i] = tmpMenus[i];
		}
		menus[2] = new Food();
		menus[3] = new Food();
		menus[2].name = "짬뽕";
		menus[3].name = "탕수육";
		for(int i=0;i<menus.length;i++) {
			System.out.println(menus[i].name);
		}
		
		/*
		 * menus에 짬뽕 탕수육 메뉴를 추가해주는데
		 * 기존에 있는 볶음밥과 짜장면도 있는상태여야 한다.
		 * 그리고 제일 마지막에 모든 메뉴를 출력해주면 된다.
		 */
	}
}
