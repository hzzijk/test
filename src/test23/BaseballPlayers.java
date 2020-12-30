package test23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseballPlayers {

	public static void main(String[] args) {
		Map<String,String> lgMap = new HashMap<String,String>();
		lgMap.put("팀명", "LG트윈스");
		lgMap.put("투수", "켈리");
		lgMap.put("타자", "김현수");
		//System.out.println(lgMap);
		
		Map<String,String> kiaMap = new HashMap<String,String>();
		kiaMap.put("팀명", "기아타이거즈");
		kiaMap.put("투수", "양현종");
		kiaMap.put("타자", "최형우");		
		//System.out.println(kiaMap);
		
		Map<String,String> ncMap = new HashMap<String,String>();
		ncMap.put("팀명", "NC다이노스");
		ncMap.put("투수", "구창모");
		ncMap.put("타자", "양의지");		
		//System.out.println(ncMap);
		
		List<Map<String,String>> teams = new ArrayList<Map<String,String>>();
		teams.add(lgMap);
		teams.add(kiaMap);
		teams.add(ncMap);
		//System.out.println(teams);
		//반복문으로 각팀의 투수들 출력		
		for(int i=0;i<teams.size();i++) {
			Map<String,String> team = teams.get(i);
			System.out.println(team.get("투수")); //팀즈의 i번째 값을 팀에 대입해서 팀의 투수를 가져오는 코드
		}
		
	}
}
