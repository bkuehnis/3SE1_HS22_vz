package vzb.ch.zhaw.strubili.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {
	
	public static void main(String[] args) {
		
		
		Random rn = new Random();
		
		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter."+"\n");
		System.out.println("Ok. Ich beginne jetzt zu raten.");
		System.out.println("Antworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");
		
		int max = 99;
		int min = 0;
		int g = rn.nextInt(min,max);
		
		Scanner keyScan = new Scanner(System.in);
		System.out.print("Ist es die "+g+"?");
		int antwort = keyScan.nextInt();
		
			while (antwort != 1) {
				
				g = rn.nextInt(min,max);
				System.out.println("Ist es die Zahl "+g+"?");
				antwort = keyScan.nextInt();
			
				if (antwort == 2) {
					
					max = g;
					
				}
				
				else if (antwort == 3) {
					
					min = g;
				}
					
			}
			
			System.out.println("Uff das war schwierig. Spielen wir nochmal?");
	}

}