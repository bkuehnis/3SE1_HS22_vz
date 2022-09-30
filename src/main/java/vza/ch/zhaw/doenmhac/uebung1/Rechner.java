package vza.ch.zhaw.doenmhac.uebung1;

public class Rechner {
	
public static void main(String[] args) {
	
double fzA = 5; // Länge von deinem Auto (Meter)
double fzB = 15; // Länge des anderen Autos (Meter)
double vA = 80; // Deine Geschwindigkeit (km/h)
double vB = 70; // Geschwindigkeit des anderen Autos(km/h)

double S1 = vA / 2;
double S2 = vB / 2;

double StreckeRelativ = fzA + S1 + fzB + S2;
double GeschwindigkeitRelativ = vA - vB;
double BZ = (StreckeRelativ / GeschwindigkeitRelativ) * 3.6;
double UW = (BZ * vA) / 3.6;


System.out.println("Geschwindigkeit A: "+vA); 
System.out.println("Geschwindigkeit B: "+vB); 
System.out.println("Länge A: "+fzA); 
System.out.println("Länge B: "+fzB);

System.out.println("Sicherheitsabstand 1: " + S1);
System.out.println("Sicherheitsabstand 2: " + S2);

System.out.println("Relative Strecke: " + StreckeRelativ + " Meter");
System.out.println("Relative Geschwindigkeit: " + GeschwindigkeitRelativ + " km/h");
System.out.println("Benötigte Zeit: " + BZ + " Sekunden");
System.out.println("Ueberholweg: " + UW + " Meter");

// Hier kommt die Lösung der Aufgabe hin...
} }