package test25;

public class MapTest3 {
	int size = 0;
	String[] keys = new String[size];
	String[] values = new String[size];
	
	String put(String key, String value) {
		size++;
		String[] tmp = keys;
		keys = new String[size];
		for(int i=0;i<tmp.length;i++) {
			keys[i] = tmp[i];
		}
		keys[size-1] = key;
		
		String[] tmp2 = values;
		values = new String[size];
		for(int i=0;i<tmp2.length;i++) {
			values[i] = tmp2[i];
		}
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
		MapTest3 mt3 = new MapTest3();
		mt3.put("이름", "홍두깨");
		mt3.put("나이", "30");
		mt3.put("성별","남자");
		System.out.println(mt3.get("이름"));
		System.out.println(mt3.get("나이"));
		System.out.println(mt3.get("성별"));
		
		
	}
}
