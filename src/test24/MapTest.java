package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("주소", "서울시 동대문구 회기동");
		
	    //Set<String> keySet = map.keySet();	
		Iterator<String> it = map.keySet().iterator();
		//맵이 갖고있는 키셋에서 이터레이터함
		while(it.hasNext()) {
			//다음거 뽑을거 있나요? 다음거 가지고 있니? true or false
			String key = it.next();// true면 실행
			System.out.println("key : " + key+ ", value : " + map.get(key));
		}
	}
}
