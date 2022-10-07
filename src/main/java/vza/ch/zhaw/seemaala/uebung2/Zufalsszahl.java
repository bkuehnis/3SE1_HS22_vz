package vza.ch.zhaw.seemaala.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufalsszahl {
public static void main(String[] args) {
	
	
	Scanner keyScan = new Scanner(System.in);
	Random rn = new Random();
	
	int zahl = rn.nextInt(101);
	int raten = 0;
	int versuche = 0;
			
	System.out.println("Rate eine Zahl zwischen 0 und 100");
	
	while(raten != zahl) { raten = keyScan.nextInt();
	versuche = versuche +1;
	
	if (raten > zahl) { System.out.println("zu gross");
	}else if (raten < zahl) { System.out.println("zu klein");
	}else { System.out.println("richtig");
	
	
	System.out.println("Richtig. Du hast "+versuche+(" Versuche benoetigt"));
	
	}} keyScan.close();
	
}


}
