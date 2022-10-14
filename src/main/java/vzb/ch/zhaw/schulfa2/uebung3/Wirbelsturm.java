package vzb.ch.zhaw.schulfa2.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Wirbelsturm {

	public static void main(String[] args) {

		int[] input = { 9, 5, 6, 4, 3, 8, 1 };
		wirbel(input);

	}

	public static void wirbel(int[] a) {
		int n = a.length;

		int index = 0;

		while (index != n / 2) {

			System.out.print(a[index] + " ");
			System.out.print(a[(n - 1) - index] + " ");

			index++;
		}
        
		// odd length handler
		if (n % 2 != 0) {
			System.out.print(a[n/2]);
		}

	}

}
