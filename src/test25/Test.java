package test25;

public class Test {
	private int size = 0;
	private String[] keys = new String[size];
	private String[] values = new String[size];
	
	String put(String key, String  value) {
		size++;
		keys = new String[size];
		keys[size-1] = key;		
		
		values = new String[size];
		values[size-1] = value;

		return key;
	}
	int indexOf(String key) {
		for(int i=0;i<keys.length;i++) {
			if(keys[i].equals(key)) {
				return i;
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
		MapTest mt = new MapTest();
		mt.put("이름", "홍길동");
		mt.put("나이","33");

		
		System.out.println(mt.get("이름"));
		System.out.println(mt.get("나이"));		
	}
}
