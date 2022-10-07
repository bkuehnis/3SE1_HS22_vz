package vzb.ch.zhaw.landsfre.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int eingabe = keyScan.nextInt();
		
		int i = 1;
		
		while (zahl!= eingabe) {
			i++;
		if (zahl < eingabe) {
			System.out.println("Zu Gross");
		}else if (zahl > eingabe) {
			System.out.println("Zu Klein");
		}
		eingabe = keyScan.nextInt();
		 }
		System.out.println("Richtig. Du hast "+i+" Versuche benötigt.");
		keyScan.close();
	}
}
	
