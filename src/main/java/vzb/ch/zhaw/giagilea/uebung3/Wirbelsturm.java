package vzb.ch.zhaw.giagilea.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Wirbelsturm {

	public static void main(String[] args) {

		int [] input = {3,5,6,7,1,2,4};
		
		int wirbel = input.length-1;
		int counter = 0;
		
		
		for (int i=0; i<input.length; i++) {
			if (wirbel%2 == 0) {
				System.out.print(input[i]+" ");
				counter++;
			}else {
				System.out.print(input[i+wirbel]+" ");
				i--;
				counter++;
			}
			wirbel --;;
			
			if (counter == input.length) {
				i = input.length;
			}
		}
	}
}
