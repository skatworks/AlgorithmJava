package jp.co.solver.java.Algorithm;

public class Basic {

	/**
	 * 3つの数値のうち、最大のものを返す
	 * @param a
	 * @param b
	 * @param c
	 * @return a,b,cのうち最大のもの
	 */
	public int getMaxIn3(int a, int b, int c) {
		int max = 0;
		max = a;

		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	/**
	 * 3つの数値のうち、中間の値を返す
	 * @param a
	 * @param b
	 * @param c
	 * @return　a,b,cのうち中間のもの
	 */
	public int getMidIn3(int a, int b, int c) {
		int mid = 0;
		if (a >= b) {
			if (b >= c) {
				mid = b;
			} else if (c >= a) {
				mid = a;
			} else {
				mid = c;
			}
		} else if (a > c) {
			mid = a;
		} else if (b > c) {
			mid = c;
		} else {
			mid = b;
		}
		return mid;
	}


}
