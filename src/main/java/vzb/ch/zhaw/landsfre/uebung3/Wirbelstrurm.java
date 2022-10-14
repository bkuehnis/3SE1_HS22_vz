package vzb.ch.zhaw.landsfre.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Wirbelstrurm {
	public static void main(String[] args) {
		 
		 int [] input = {3,5,6,7,1,2,4};
		 
		 // TODO: Ausgabe im Wirbelsturm-Format
		 for (int i = 0; i <= input.length/2;i++ ) {
			if (i < input.length/2) {
				System.out.print(input[i]+" ");
			}
			if(i < input.length/2) {
				System.out.print(input[input.length - (i + 1)]+" ");
			}
		 }
		
		 if (input.length / 2 * 2 != input.length) {
			 System.out.print(input[input.length - input.length / 2 - 1]);
		 }
		 
		 
		 }
}
