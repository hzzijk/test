package test21;

public class ArrayTest3 {

	static double[] add(double[] dbs, double db) {
		
		return dbs;
	}
	public static void main(String[] args) {
		double[] dbs = new double[1];
		dbs[0] = 1.1;

		double[] tmp = dbs;
		dbs = new double[2];
		for(int i=0;i<tmp.length;i++) {
			dbs[i] = tmp[i];
		}
		dbs[1] = 2.2;
		ArrayUtil.printArray(dbs);
	}
}
