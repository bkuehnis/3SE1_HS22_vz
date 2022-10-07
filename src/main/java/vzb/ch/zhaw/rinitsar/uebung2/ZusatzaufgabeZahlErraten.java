package vzb.ch.zhaw.rinitsar.uebung2;

import java.io.IOException;
import java.util.Scanner;

public class ZusatzaufgabeZahlErraten {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner keyScan = new Scanner(System.in);
		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und druecke dann Enter.");
		System.in.read();
		System.out.println("Ok. Ich beginne jetzt zu raten. "
				+ "Antworte mir mit 1 fuer richtig, 2 fuer kleiner und 3 fuer groesser.");
			
		int programm = 50; // Programm beginnt mit 50
		int maximum = 100; // höchste Zahl, welche Programm erraten kann
		int minimum = 0; // kleinste Zahl, welche Programm erraten kann
		
		System.out.println("Ist es die 50?");
		int meinezahl = keyScan.nextInt(); // Meine Antwort, ob Zahl zu gross, zu klein oder richtig ist
		
		while (meinezahl != 1) {
			if(meinezahl == 2 ) {
			
			maximum = programm; // Zahl, welche Programm sagt ist das neue Maximum
			programm = (maximum+minimum)/2;
			
			System.out.println("Ist es die " + programm + " ?");
			
			meinezahl = keyScan.nextInt(); //Antwort geben, ob Zahl grösser oder kleiner ist
				
			}
			
			if(meinezahl == 3) {
				
			minimum = programm;
			programm = (maximum+minimum)/2;
			
			System.out.println("Ist es die " + programm + " ?");
			
			meinezahl = keyScan.nextInt(); //Antwort geben, ob Zahl grösser oder kleiner ist	
				
			} 
		}
		System.out.println("Uff, das war schwierig. Spielen wir nochmal?");
	}

}
