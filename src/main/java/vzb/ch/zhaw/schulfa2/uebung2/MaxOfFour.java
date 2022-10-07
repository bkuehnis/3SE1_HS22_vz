package vzb.ch.zhaw.schulfa2.uebung2;

import java.util.Scanner;

public class MaxOfFour {
	
	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		System.out.println("Bitte vier Zahlen eingeben:");
		int a1 = keyScan.nextInt();
		int a2 = keyScan.nextInt();
		int a3 = keyScan.nextInt();
		int a4 = keyScan.nextInt();
		
		int [] zahlen = new int[4];
		zahlen[0] = a1;
		zahlen[1] = a2;
		zahlen[2] = a3;
		zahlen[3] = a4;
		
		int max = 0;
	     
		for (int i=0; i<4; i++) {
			if (max < zahlen[i]) {
				max = zahlen[i];
			}
		}
		
		
		System.out.println("Die grösste eingegebene Zahl ist " + max + ".");
	}
}