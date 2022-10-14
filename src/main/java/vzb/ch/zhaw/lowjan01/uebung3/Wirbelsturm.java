package vzb.ch.zhaw.lowjan01.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Wirbelsturm {

	public static void main(String[] args) {

		int[] i = { 3, 5, 6, 7, 1, 2, 4 };

		int s = i.length - 1;
		while (s >= 0) {
			System.out.print(i[s]);
			s--;
		}

	}

}
