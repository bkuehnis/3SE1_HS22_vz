package vza.ch.zhaw.kernpas1.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class ZusatzaufgabeWirbelsturm {

	public static void main(String[] args) {

		int [] input = {1,3,5,7,9,11,13,15,17,19,20,18,16,14,12,10,8,6,4,2};
		boolean zaehler = true;
		int b = 0;

		for ( int i = 0; i < input.length; i++) {
			if(zaehler) {
				System.out.print(input[b]+", ");
				zaehler = !zaehler;
			} 
			else if(!zaehler) {
				System.out.print(input[input.length-1-b]+", ");
				zaehler = !zaehler;
				b++;
			}
		}
	}

}
