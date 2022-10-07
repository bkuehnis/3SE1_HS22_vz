package vzb.ch.zhaw.steinol3.uebung2;

import java.util.Random;
import java.util.Scanner;

public class task2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rn = new Random();

		int zahl = rn.nextInt(100);

		int count = 45;
		
		int tries = 1;

		Scanner keyScan = new Scanner(System.in);

		System.out.println("Rate eine Zahl zwischen 0 und 100");

		int eingabe = keyScan.nextInt();

		while (eingabe != count) {

			if (eingabe > 45) {
				System.out.println("zu gross");
				eingabe = keyScan.nextInt();
			} else if (eingabe < 45) {
				System.out.println("zu klein");
				eingabe = keyScan.nextInt();
				
				tries = tries + 1;
			
			} 

			}
		System.out.println("Richtig, du hast " + tries + " Versuche benötigt.");
		
		}

	}

