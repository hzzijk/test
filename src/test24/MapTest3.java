package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
		/*
		 * Map 데이터타입의 변수를 선언과 초기화
		 * 키 값 1 : 감자, 2:고구마, 3: 옥수수, 4: 대추
		 * 각 키값들의 데이터타입은 인티저
		 * 밸류는 스트링
		 * 이터레이터를 사용해서 모든 키와 밸류를 출력하는코드완성
		 */
		Map<Integer,String> vegetable = new HashMap<Integer,String>();
		
		vegetable.put(1, "감자");
		vegetable.put(2, "고구마");
		vegetable.put(3, "옥수수");
		vegetable.put(4, "대추");
		
		Set<Integer> keySet = vegetable.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			Integer key = it.next();//키를 알기도해야하지만 빼오기도 해야함.
			System.out.println("key : " + key + ", value : " + vegetable.get(key));
		}
		
	}
}
