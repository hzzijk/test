package test25;
/*Map <-- 키와 밸류를 저장해야돼서 배열같은게 2개 들어있음
 * put
 * get
 * 
 * ArrayList <-- 배열의 확장판
 * List l = new ArrayList();
 * l.add(1);	
 */
public class MapTestTest {
	private int size = 0;
	private String[] keys = new String[size]; //방이 하나도 없어서
	private String[] values = new String[size];

	String put(String key, String value) {
		size ++;
		keys = new String[size]; //keys.length();방하나를 만들어주고
		keys[size-1] = key; //마지막 방번호에 입력하는 거

		values = new String[size];
		values[size-1] = value; //자기가 가진 방번호보다 하나가 많아야 된다. 왜지. 왜마이너스하지, 위 설명 참고.
		return key;
	}
	int size() {
		return size;
	}
	int indexOf(String key) {
		for(int i=0;i<keys.length;i++) {
			if(keys[i].equals(key)) {
				return i ;
			}
		}
		return -1;
	}
	String get(String key) {
		int idx = indexOf(key);
		if(idx==-1) {
			return null;
		}
		return values[idx];
	}
	public static void main(String[] args) {
		//다시한번 작성해볼것.
		MapTest mt = new MapTest();
		mt.put("이름", "홍길동");
		mt.put("이름", "홍순도");

		System.out.println(mt.get("이름"));
		System.out.println(mt.get("이름 "));

	}
}
