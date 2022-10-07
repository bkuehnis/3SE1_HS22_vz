package vza.ch.zhaw.campbjam.uebung2;

import java.util.Scanner;

public class MaxOfFour {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.println("Bitte vier Zahlen eingeben:");
		int a1 = keyScan.nextInt();
		int a2 = keyScan.nextInt();
		int a3 = keyScan.nextInt();
		int a4 = keyScan.nextInt();

		if (a1 > a2) {
			if (a1 > a3) {
				if (a1 > a4) {
					System.out.println("Die grösste eingegebene Zahl ist " + a1);
				}
			}
		} else if (a2 > a3) {
			if (a2 > a4) {
				System.out.println("Die grösste eingegebene Zahl ist " + a2);
			}
		} else if (a3 > a4) {
			System.out.println("Die grösste eingegebene Zahl ist " + a3);
		} else {
			System.out.println("Die grösste eingegebene Zahl ist " + a4);
		}
		keyScan.close();

	}
}