package vzb.ch.zhaw.landsfre.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenErraten {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		
		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		
		String eingabe = keyScan.nextLine();
		
		if (eingabe != null) {
			System.out.println("Ok. Ich beginne jetzt zu raten.\r\n"+ "Antworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.\r\n");
		}
		
		int zahl = rn.nextInt(101);
		
		System.out.println("Ist es die "+zahl);
		
		int obergrenze = 100;
		int untergrenze = 0;
		int a = keyScan.nextInt();
		
		 
		while (a != 1) {
		if (a == 2) {
			obergrenze = zahl;
			int zahl2 = rn.nextInt(obergrenze);	
			while ((untergrenze >= zahl2) || (obergrenze <= zahl2)) {
				zahl2 = rn.nextInt(101);
				
			}
			System.out.println("Ist es die "+zahl2);
			zahl = zahl2;
			
			
		}else if (a == 3) {
				untergrenze = zahl;
			
			int zahl2 = rn.nextInt(obergrenze);
			while ((untergrenze >= zahl2) || (obergrenze <= zahl2)) {
				zahl2 = rn.nextInt(101);
				
			}
			System.out.println("Ist es die "+zahl2);
			zahl = zahl2;
			
			
		}
		a = keyScan.nextInt();
		}
		System.out.println("Uff, das war schwierig. Spielen wir nochmal?");
		keyScan.close();
	}
}
