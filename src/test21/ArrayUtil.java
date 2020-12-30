package test21;



public class ArrayUtil {
	static int[] remove(int[] nums) {
		int[] tmp = nums;
		nums = new int[nums.length-1];
	
		for(int i=0;i<nums.length;i++) {
			nums[i] = tmp[i];
		}		
		return nums;
	}
	static String[] add(String[] arr, String str) {
		String[] tmp = arr;
		arr = new String[arr.length+1];
		for(int i=0;i<tmp.length;i++) {
			arr[i] = tmp[i];
		}
		arr[arr.length-1] = str;
		
		return arr;		
	}
	static double[] add(double[] dbs, double db) {
		double[] tmp = dbs;
		
		dbs = new double[dbs.length+1];
		for(int i=0;i<tmp.length;i++) {
			dbs[i] = tmp[i];
		}
		dbs[dbs.length-1] = db;
		return dbs;
	}
	static int[] add(int[] arr,int num) {
		int[] tmp = arr;
		arr = new int[arr.length+1];
		
		for(int i=0;i<tmp.length;i++) {
			arr[i] = tmp[i];
		}
		arr[arr.length-1] = num;
		return arr;
	}	
	//참조형타입은 전부 object[]로 만들면 퉁칠수있다.
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	static void printArray(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	static void printArray(double[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	

}
