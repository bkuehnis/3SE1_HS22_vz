package vza.ch.zhaw.schnymat.uebung2;

import java.util.Scanner;
import java.util.Arrays;

public class MaxOfFour {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.println("Bitte vier Zahlen eingeben:");
		int a1 = keyScan.nextInt();
		int a2 = keyScan.nextInt();
		int a3 = keyScan.nextInt();
		int a4 = keyScan.nextInt();
		
		int numbers[] = {a1, a2, a3, a4};
		
		Arrays.sort(numbers);
		
		// Ich werde hier noch die Lösung ohne die Libary Arrays aufzeigen.
		
		/*
		 * int groessteZahl = 0;
		 * 
		 * if (a1 > groessteZahl) { groessteZahl = a1; }
		 * 
		 * if (a2 > groessteZahl) { groessteZahl = a2;
		 * 
		 * }
		 * 
		 * if (a3 > groessteZahl) { groessteZahl = a3;
		 * 
		 * }
		 * 
		 * if (a4> groessteZahl) { groessteZahl = a4;
		 * 
		 * }
		 */
		
		
		// Hier würde dann anstatt numbers[3] einfach groessteZahl stehen.
		System.out.println("Die grösste eingegebene Zahl ist " + numbers[3]);
	}
}
