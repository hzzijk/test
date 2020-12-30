package test23;

public abstract class Animal {
	public abstract void borned();
	public final void died() {
		System.out.println("RIP");
	}	
}

class Mamals extends Animal{
	@Override
	public void borned() {
		System.out.println("새끼로 태어났어요~");		
	}	
}
class Reptile extends Animal{
	@Override
	public void borned() {
		System.out.println("알로 태어났어요~");
	}	
}
