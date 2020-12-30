package test21;

public class Test {
	static double[] add(double[] dbs, double db) {
		double[] tmp = dbs;
		
		dbs = new double[dbs.length+1];
		for(int i=0;i<tmp.length;i++) {
			dbs[i] = tmp[i];
		}
		dbs[dbs.length-1] = db;
		return dbs;
	}
	public static void main(String[] args) {
		double[] dbs = new double[0];
		
		dbs = add(dbs,1.1);
		dbs = add(dbs,2.2);
		ArrayUtil.printArray(dbs);

	}
}
