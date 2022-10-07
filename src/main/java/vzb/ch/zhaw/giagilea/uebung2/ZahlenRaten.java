package vzb.ch.zhaw.giagilea.uebung2;

import java.util.Scanner;
import java.util.Random;

public class ZahlenRaten {

	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		boolean erraten= false;
		int randomZahl = rn.nextInt(101);
		int counter = 0;
		
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		while (erraten == false) {
			int zahl = keyScan.nextInt();
			counter ++;
			
			if (zahl < randomZahl) {
				System.out.println("Zu klein");
			}else if (zahl > randomZahl) {
				System.out.println("Zu gross");
			}else {
				System.out.print("Richtig. Du hast "+counter+" Versuche benötigt.");
				erraten = true;
			}
		}
	}
}
