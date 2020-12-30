package test20;

class Father{	
	void work() {
		System.out.println("아빠가 일함");
	}
}
class Son extends Father{	
	void work() {
		System.out.println("아들이 일함");
	}
}
class Daughter extends Father{
	void makeUp() {
		System.out.println("딸이 화장을 함");
	}
	void work() {
		System.out.println("딸이 일함");
	}
}
public class Excute {
	//아들 1명, 딸 2명
	public static void main(String[] args) {
		Son s = new Son();
		Daughter d1 = new Daughter();
		Daughter d2 = new Daughter();
		Daughter[] ds = new Daughter[2];
		ds[0] = d1;
		ds[1] = d2;
		
		Father[] fs = new Father[3];
		fs[0] = s; // 아들을 넣어서, 
		fs[1] = d1;
		fs[2] = d2;
//		fs[0].work(); // 오버라이딩돼서 아들이일함이 나옴
//		fs[1].work();
		for(int i=0;i<fs.length;i++) {
			if(fs[i] instanceof Daughter) {
			// fs[i]의 데이터 타입이 Daughter인지 확인하는 거 트루면 실행	
			// 다운캐스팅만 하면 아들타입으로 인해 캐스팅오류가 남. 그래서 이프문으로 물어보는 거임.
				Daughter d = (Daughter)fs[i];
				d.makeUp();
			}
			fs[i].work();
		}
	}
}
