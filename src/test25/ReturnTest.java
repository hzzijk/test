package test25;

public class ReturnTest {

	String[] strs = {"가","나","다","라"};
	
	int indexOf(String str) {
		for(int i=0;i<strs.length;i++) {
			if(strs[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}
		
	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();//스태틱이아니어서 클래스 메모리생성
		int idx = rt.indexOf("나");
		System.out.println(idx);
		idx = rt.indexOf("마");
		System.out.println(idx);
		
	}
}
