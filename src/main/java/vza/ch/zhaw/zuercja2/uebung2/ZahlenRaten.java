package vza.ch.zhaw.zuercja2.uebung2;


import java.util.Random;
import java.util.Scanner;
public class ZahlenRaten {

	public static void main(String[] args) {
	Random rn = new Random();
	Scanner keyScan = new Scanner(System.in);
	int zahl = rn.nextInt(101);
	int raten = 0;
	int versuche = 1;
			
	System.out.println("Rate eine Zahl zwischen 1 und 100");
	while (raten != zahl) { raten = keyScan.nextInt();
	if (raten>zahl) { System.out.println("zu gross");
	} else if(raten<zahl) { System.out.println("zu klein");
	} else {System.out.println("Richtig. Du hast "+versuche+" Versuche benoetigt");}
	versuche = versuche+1;
	}
    
    
    keyScan.close();
	}
}