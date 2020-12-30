package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("소주", "19도");
		map.put("맥주","4.5도");
		map.put("사케", "12도");
		map.put("보드카","53도");
		map.put("빠이주", "65도");
		//map.keySet() 키값을 가져오는 메소드의 호출
		//아래는 키 값이랑 동일하게 String
		Set<String>	keySet = map.keySet(); //키값을 어딘가에 저장.
		Iterator<String> it = keySet.iterator();//활용하려면 데이터타입 확인 후 어딘가에 저장.
		//그런다음에 몇개인지를 모르기때문에 와일문으로 다음거 있는지를 물어봐줘야함.
		//메서드명 바로 앞에 is-이거맞아?, has-갖고있어?, contains-포함하니?, include-그 안에 있어?로 시작하면 얘들의 데이터타입은 boolean
		while(it.hasNext()) { //다음거 갖고있어?
			String key = it.next(); // 다음거 갖고와/ 메서드의 호출 -> 어딘가 저장
			System.out.println(key);
		}//put한 순서대로는 아니겠지만 있는지 확인하고 하나씩 뽑아옴.
		
		
	}
}
