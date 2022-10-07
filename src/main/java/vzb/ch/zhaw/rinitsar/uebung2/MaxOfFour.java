package vzb.ch.zhaw.rinitsar.uebung2;

import java.util.Scanner;

public class MaxOfFour {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.println("Bitte vier Zahlen eingeben:");
		int a1 = keyScan.nextInt();
		int a2 = keyScan.nextInt();
		int a3 = keyScan.nextInt();
		int a4 = keyScan.nextInt();
		
		if(a1 > a2 && a1 > a3 && a1 > a4) {
			System.out.println("Die groesste eingegebene Zahl ist " + a1);
		}
		
		if (a2 > a1 && a2 > a3 && a2 > a4) {
			System.out.println("Die groesste eingegebene Zahl ist " + a2);
		}
		
		if (a3 > a1 && a3 > a2 && a3 > a4) {
			System.out.println("Die groesste eingegebene Zahl ist " + a3);
		}
		
		if (a4 > a1 && a4 > a2 && a4 > a3) {
		System.out.println("Die groesste eingegebene Zahl ist " + a4);
		}

		keyScan.close();
	}
}