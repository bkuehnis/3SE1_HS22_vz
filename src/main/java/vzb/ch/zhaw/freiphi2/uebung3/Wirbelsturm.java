package vzb.ch.zhaw.freiphi2.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Wirbelsturm {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int count = 0;
		int maxIndex = input.length - 1;
		int tempZahl;

		while (count <= maxIndex / 2) {
			tempZahl = input[count];
			input[count] = input[maxIndex - count];
			input[maxIndex - count] = tempZahl;
			count++;
		}
		System.out.println(java.util.Arrays.toString(input));
	}
}
