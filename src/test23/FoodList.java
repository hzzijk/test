package test23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodList {

	public static void main(String[] args) {
		Map<String,String> macaronMap = new HashMap<String,String>();
		macaronMap.put("음식명","마카롱");
		macaronMap.put("가격", "2,000");
		macaronMap.put("칼로리", "200k");
		macaronMap.put("종류", "디저트");

		Map<String,String> maraMap = new HashMap<String,String>();
		maraMap.put("음식명","마라탕");
		maraMap.put("가격", "14,000");
		maraMap.put("칼로리", "1500k");
		maraMap.put("종류", "중식");

		Map<String,String> chikenMap = new HashMap<String,String>();
		chikenMap.put("음식명","치킨");
		chikenMap.put("가격", "15,000");
		chikenMap.put("칼로리", "2000k");
		chikenMap.put("종류", "한식");
		
		Map<String,String> sushiMap = new HashMap<String,String>();
		sushiMap.put("음식명","초밥");
		sushiMap.put("가격", "20,000");
		sushiMap.put("칼로리", "600k");
		sushiMap.put("종류", "일식");
		
		List<Map<String,String>> foods = new ArrayList<Map<String,String>>();
		foods.add(macaronMap);
		foods.add(maraMap);
		foods.add(chikenMap);
		foods.add(sushiMap);
		System.out.println(foods);
		//리스트의 각 방에 있는 음식의 정보를 아래와같이 출력
		//[음식명 : 마카롱, 가격 : 2000]
		for(int i=0;i<foods.size();i++) {

			Map<String,String> foodsMap = foods.get(i);
			System.out.println("[음식명 : "+foodsMap.get("음식명")+", 가격 : "+foodsMap.get("가격")+"]");
		}


	}
}
