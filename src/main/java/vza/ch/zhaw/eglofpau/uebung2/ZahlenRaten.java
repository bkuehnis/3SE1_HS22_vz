package vza.ch.zhaw.eglofpau.uebung2;



import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	
	

	public static void main(String[] args) {
		
		Random rn = new Random();
		 int zahl = rn.nextInt(100);
		 Scanner keyScan = new Scanner(System.in);
		 System.out.println("Rate eine Zahl zwischen 0 und 100");
		 System.out.println(zahl);
		int Eingabe = keyScan.nextInt();
		int count = 1;
		
		while (zahl != Eingabe) {
			
		if (zahl > Eingabe) {System.out.println("zu klein");
		}
		if (zahl < Eingabe) {System.out.println("zu gross");
		}
		Eingabe = keyScan.nextInt();
		count ++;
		
	}
		if (zahl == Eingabe) {System.out.print("Richtig. Du hast "+count+" Versuche benötigt.");
		}
		keyScan.close();
				
		}

	}
