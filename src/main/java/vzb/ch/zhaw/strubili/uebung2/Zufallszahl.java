package vzb.ch.zhaw.strubili.uebung2;

import java.util.Random;
import java.util.Scanner;

	public class Zufallszahl {
		public static void main(String[] args) {
			
			Random rn = new Random();
			
			int zz = rn.nextInt(0,100);
			int count = 1;
			
			Scanner keyScan = new Scanner(System.in);
			System.out.print("Rate eine Zahl zwischen 0 und 100: ");
			int antwort = keyScan.nextInt();
			
			while (antwort != zz) {
				
				if (antwort<zz) {
					
					System.out.println("Deine Zahl ist zu niedrig!"+"\n");
					System.out.println("Versuch es nochmal: ");
					antwort = keyScan.nextInt();	
				}	
				
				else if (antwort>zz) {
				
					System.out.println("Deine Zahl ist zu hoch!"+"\n");
					System.out.print("Versuch es nochmal: ");
					antwort = keyScan.nextInt();
			}
			
			count++;
			
			}
				System.out.println("Das ist richtig!");
				System.out.println("Du hast "+count+" Versuche gebraucht.");
			
				keyScan.close();
		}
	}
	