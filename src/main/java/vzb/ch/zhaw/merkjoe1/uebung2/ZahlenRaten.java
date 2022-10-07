package vzb.ch.zhaw.merkjoe1.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {

	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		int antwort = keyScan.nextInt();
		int i = 1;

		while (antwort != zahl) 
		{
			if (antwort > zahl) 
			{
				System.out.println("zu gross");
			} 
			else if (zahl > antwort) 
			{
				System.out.println("zu klein");
			}
			antwort = keyScan.nextInt();
			i++;
		}
		if (antwort == zahl)
		{
			System.out.println("Richtig. Du hast " + i +" Versuche benoetigt");
		}
		keyScan.close();
	}
}