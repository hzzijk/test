package test21;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] nums = new int[0];
		nums = ArrayUtil.add(nums,5);
		nums = ArrayUtil.add(nums,10);
		System.out.println("배열 방 늘린 후");
		ArrayUtil.printArray(nums);
		
		nums = ArrayUtil.remove(nums);
		nums = ArrayUtil.remove(nums);
		System.out.println("배열 방 축소 후");
		ArrayUtil.printArray(nums);
	}
}
