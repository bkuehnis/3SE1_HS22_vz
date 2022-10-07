package vzb.ch.zhaw.freiphi2.uebung2;

import java.util.Scanner;

public class Höchste4v2 {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.println("Bitte vier Zahlen eingeben:");
		int a1 = keyScan.nextInt();
		int a2 = keyScan.nextInt();
		int a3 = keyScan.nextInt();
		int a4 = keyScan.nextInt();
		keyScan.close();
		System.out.println(Math.max(a1, Math.max(a2, Math.max(a3, a4))));
		
	}
}