package test09;

import java.util.Random;

public class CountRooms {

	public static void main(String[] args) {
		int[][] rooms = new int[4][];
		Random r = new Random();
		for(int i=0;i<rooms.length;i++) {
			rooms[i] = new int[r.nextInt(10)+1];
//   		rooms[i] = new int[(i+1)*3]; 층마다 3,6,9,12개 만들기
		}
		int sum = 0; // 마지막 출력을 위해 추가.
		for(int i=0;i<rooms.length;i++) {
			sum += rooms[i].length; // 마지막 출력을 위해 추가
//			sum = sum + rooms[i].length;
			System.out.println(i + "층 방갯수 : " + rooms[i].length + "개");
		}
		System.out.println("총 방 갯수는 :" + sum);
//		System.out.print(rooms[0].length+rooms[1].length+rooms[2].length+rooms[3].length);
//		System.out.print("개 입니다.");
	}
}
