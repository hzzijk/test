package test19;

public class MobilePhone implements Volume{
	int volume;
	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("현재 볼륨 : " + (++volume));	
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("현재 볼륨 : " + (--volume));
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("현재 볼륨 : " + volume);
	}
	
}
