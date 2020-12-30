package test19;

public class Excute {
//	void volumeControl(Volume v,int type) {
//		if(type==1) {
//			v.up();
//		}else if(type==2) {
//			v.down();
//		}else {
//			v.mute();
//		}
//	}
	public static void main(String[] args) {
		Volume v = new MobilePhone();
		v.up();
		v.down();
		v.mute();
	}
}
