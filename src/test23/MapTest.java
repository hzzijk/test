package test23;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> human = new HashMap<String,String>();
		human.put("이름", "홍길동");
		human.put("나이", "22");
		human.put("주소", "서울");
		human.put("직업", "개발자");
		
		System.out.println(human);
		System.out.println(human.get("이름"));
		
	}
}
