package vzb.ch.zhaw.durmibet.uebung2;

import java.util.Random;
import java.util.Scanner;
public class ZahlenRaten {
 public static void main(String[] args) {
Scanner keyScan = new Scanner(System.in);
Random rn = new Random();
boolean erraten = false;
int zahl = rn.nextInt(101);
System.out.println("Rate eine Zahl zwischen 0 und 100");
int Versuche=0;//Zählt die Versuche
while (erraten == false) {
int Zufallszahl = keyScan.nextInt();
int counter=0;
counter++;
if (Zufallszahl < zahl) {
	System.out.println("zu klein");
} else if ( Zufallszahl > zahl) {
	System.out.println("zu gross");
} else {
	System.out.println("Richtig. Du hast "+counter+" Versuche benötigt.");
	erraten = true;
}//Weiss nicht mehr weiter. Steht immer, dass man nur 1 Versuch gebraucht hat.
}
}
 }